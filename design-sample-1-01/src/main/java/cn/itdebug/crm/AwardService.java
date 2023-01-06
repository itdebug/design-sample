package cn.itdebug.crm;

import com.alibaba.fastjson.JSON;
import org.itdebug.crm.card.VipCardService;
import org.itdebug.crm.coupon.CouponResult;
import org.itdebug.crm.coupon.CouponService;
import org.itdebug.crm.goods.DeliverReq;
import org.itdebug.crm.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AwardService {

    private Logger logger = LoggerFactory.getLogger(AwardService.class);

    public AwardRes awardToUser(AwardReq awardReq) {
        String reqJson = JSON.toJSONString(awardReq);
        logger.info("奖品发放开始{}。req:{}", awardReq.getUnionId(), reqJson);
        AwardRes awardRes = null;
        switch (awardReq.getAwardType()) {
            case VIP_CARD:
                VipCardService vipCardService = new VipCardService();
                vipCardService.grantVipCard(awardReq.getUnionId(), awardReq.getAwardNumber());
                awardRes = new AwardRes("200", "发放成功");
                break;
            case COUPON:
                CouponService couponService = new CouponService();
                CouponResult couponResult = couponService.sendCoupon(awardReq.getUnionId(), awardReq.getAwardNumber());
                if(couponResult.getCode() == "200") {
                    awardRes = new AwardRes("200", "发放成功");
                } else {
                    awardRes = new AwardRes("1000", couponResult.getMsg());
                }
                break;
            case GOODS:
                GoodsService goodsService = new GoodsService();
                DeliverReq deliverReq = new DeliverReq();
                Boolean isSuccess = goodsService.deliverGoods(deliverReq);
                if(isSuccess) {
                    awardRes = new AwardRes("200", "发放成功");
                } else {
                    awardRes = new AwardRes("1000", "发送失败");
                }
                break;
            default:
                break;
        }
        logger.info("奖品发送完成{}。", awardReq.getUnionId());
        return awardRes;
    }
}

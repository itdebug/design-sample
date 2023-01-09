package cn.itdebug.award.impl;

import cn.itdebug.award.ICommodity;
import com.alibaba.fastjson.JSON;
import org.itdebug.crm.coupon.CouponResult;
import org.itdebug.crm.coupon.CouponService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CouponCommodityService implements ICommodity {

    Logger logger = LoggerFactory.getLogger(CouponCommodityService.class);

    private CouponService couponService = new CouponService();

    @Override
    public void awardToUser(String uid, String cardId, String bizId, Map<String, String> extraMap) {
        CouponResult couponResult = couponService.sendCoupon(uid, cardId);
        logger.info("请求参数[发送优惠券] => uid: {}, carId: {}, bizId: {} extraMap: {}", uid, cardId, bizId, JSON.toJSONString(extraMap));
        logger.info("请求结果[发送优惠券]: {}", JSON.toJSONString(couponResult));

        if(!"200".equals(couponResult.getCode())) {
            throw new RuntimeException(couponResult.getMsg());
        }

    }
}

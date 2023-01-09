package cn.itdebug.award.impl;

import cn.itdebug.award.ICommodity;
import com.alibaba.fastjson.JSON;
import org.itdebug.crm.goods.DeliverReq;
import org.itdebug.crm.goods.GoodsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class GoodsCommodityService implements ICommodity {

    Logger logger = LoggerFactory.getLogger(GoodsCommodityService.class);

    private GoodsService goodsService = new GoodsService();

    @Override
    public void awardToUser(String uid, String cardId, String bizId, Map<String, String> extraMap) {
        DeliverReq deliverReq = new DeliverReq();
        deliverReq.setName(queryUserName(uid));
        deliverReq.setMobile(queryUserPhoneNumber(uid));
        deliverReq.setSku(cardId);
        deliverReq.setOrderId(bizId);
        deliverReq.setDeliverUserName(extraMap.get("deliverUserName"));
        deliverReq.setDeliverUserMobile(extraMap.get("deliverUserMobile"));
        deliverReq.setDeliverUserAddress(extraMap.get("deliverUserAddress"));
        Boolean isSuccess = goodsService.deliverGoods(deliverReq);

        logger.info("请求参数[发送到家] => uId：{} commodityId：{} bizId：{} extMap：{}", uid, cardId, bizId, JSON.toJSONString(extraMap));
        logger.info("测试结果[发送到家]: {}", isSuccess);

        if(!isSuccess) {
            throw new RuntimeException("实物商品发放失败");
        }
    }

    private String queryUserName(String uId) {
        return "花花";
    }

    private String queryUserPhoneNumber(String uId) {
        return "15200101232";
    }
}

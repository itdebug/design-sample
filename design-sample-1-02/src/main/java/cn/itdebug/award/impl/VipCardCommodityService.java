package cn.itdebug.award.impl;

import cn.itdebug.award.ICommodity;
import org.itdebug.crm.card.VipCardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class VipCardCommodityService implements ICommodity {

    Logger logger = LoggerFactory.getLogger(VipCardCommodityService.class);

    private VipCardService vipCardService = new VipCardService();

    @Override
    public void awardToUser(String uid, String commodityId, String bizId, Map<String, String> extraMap) {
        String mobile = queryUserMobile(uid);
        vipCardService.grantVipCard(mobile, bizId);
        logger.info("请求参数[发送会员卡] => uid: {} commodityId: {} bizId: {} extMap: {}", uid, commodityId, bizId, extraMap);
        logger.info("测试结果[发送会员卡]: success");
    }

    private String queryUserMobile(String uid) {
        return "17621689246";
    }
}

package org.itdebug.crm.card;

/**
 * 模拟发送会员卡服务
 */
public class VipCardService {

    public void grantVipCard(String unionId, String cardId) {
        System.out.println("模拟发放VIP会员卡一张:" + unionId + ", " + cardId);
    }
}

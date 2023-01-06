package org.itdebug.crm.goods;

import org.itdebug.crm.coupon.CouponResult;

/**
 * 模拟实物快递到家服务
 */
public class GoodsService {

    public Boolean deliverGoods(DeliverReq req) {
        System.out.println("模拟快递发送实物一个:" + req.toString());
        return true;
    }
}

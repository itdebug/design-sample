package org.itdebug.crm.coupon;

/**
 * 模拟发送优惠券服务
 */
public class CouponService {

    public CouponResult sendCoupon(String unionId, String cardId) {
        System.out.println("模拟发放优惠券一张:" + unionId + ", " + cardId);
        return new CouponResult("200", "发放成功");
    }
}

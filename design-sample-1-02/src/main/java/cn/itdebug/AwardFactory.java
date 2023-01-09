package cn.itdebug;

import cn.itdebug.award.ICommodity;
import cn.itdebug.award.impl.CouponCommodityService;
import cn.itdebug.award.impl.GoodsCommodityService;
import cn.itdebug.award.impl.VipCardCommodityService;
import org.itdebug.crm.AwardTypeEnum;

public class AwardFactory {

    public ICommodity createAwardService(AwardTypeEnum awardType) {
        switch (awardType) {
            case VIP_CARD:
                return new VipCardCommodityService();
            case COUPON:
                return new CouponCommodityService();
            case GOODS:
                return new GoodsCommodityService();
            default:
                return null;
        }
    }
}

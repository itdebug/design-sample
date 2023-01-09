package cn.itdebug;

import cn.itdebug.award.ICommodity;
import org.itdebug.crm.AwardTypeEnum;
import org.junit.Test;

import java.util.HashMap;

public class ApiTest {

    @Test
    public void testCommodity() throws Exception {
        AwardFactory awardFactory = new AwardFactory();

        //1、会员卡
        ICommodity awardService1 = awardFactory.createAwardService(AwardTypeEnum.VIP_CARD);
        awardService1.awardToUser("10001", "xxxx", null, null);

        //2、优惠券
        ICommodity awardService2 = awardFactory.createAwardService(AwardTypeEnum.COUPON);
        awardService2.awardToUser("10002", "xxxxx", "333333", null);

        //3、实物商品
        ICommodity awardService3 = awardFactory.createAwardService(AwardTypeEnum.GOODS);
        awardService3.awardToUser("10003", "xxxxxxx", "3333333333", new HashMap<String, String>() {
            {
                put("deliverUserName", "张三");
                put("deliverUserMobile", "17266883338");
                put("deliverUserAddress", "上海市，闵行区");
            }
        });
    }
}

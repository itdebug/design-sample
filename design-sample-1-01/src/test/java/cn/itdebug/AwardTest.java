package cn.itdebug;


import cn.itdebug.crm.AwardReq;
import cn.itdebug.crm.AwardRes;
import cn.itdebug.crm.AwardService;
import cn.itdebug.crm.AwardTypeEnum;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AwardTest {

    private Logger logger = LoggerFactory.getLogger(AwardTest.class);

    @Test
    public void testAwardToUser() {

        logger.info("\r\n 模拟会员卡发放测试\r\n");
        AwardService awardService = new AwardService();
        AwardReq awardReq0 = new AwardReq();
        awardReq0.setAwardType(AwardTypeEnum.VIP_CARD);
        awardReq0.setUnionId("张三");
        awardReq0.setAwardNumber("会员卡");
        AwardRes awardRes = awardService.awardToUser(awardReq0);

        logger.info("请求参数：{}", JSON.toJSONString(awardReq0));
        logger.info("请求结果：{}", JSON.toJSONString(awardRes));

        logger.info("\r\n 模拟优惠券发放测试\r\n");
        AwardReq awardReq1 = new AwardReq();
        awardReq1.setAwardType(AwardTypeEnum.COUPON);
        awardReq1.setUnionId("李四");
        awardReq1.setAwardNumber("优惠券");
        AwardRes awardRes1 = awardService.awardToUser(awardReq1);

        logger.info("请求参数：{}", JSON.toJSONString(awardReq1));
        logger.info("请求结果：{}", JSON.toJSONString(awardRes1));

        logger.info("\r\n 模拟商品到家发放测试\r\n");
        AwardReq awardReq2 = new AwardReq();
        awardReq2.setAwardType(AwardTypeEnum.GOODS);
        awardReq2.setUnionId("王五");
        awardReq2.setAwardNumber("商品到家");
        AwardRes awardRes2 = awardService.awardToUser(awardReq2);

        logger.info("请求参数：{}", JSON.toJSONString(awardReq2));
        logger.info("请求结果：{}", JSON.toJSONString(awardRes2));
    }
}

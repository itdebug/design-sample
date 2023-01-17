package cn.itdebug;

import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {
        PayService payService = new PayService();
        System.out.println("\r\n模拟测试场景：微信支付、人脸方式。");
        payService.doPay("weixin_20230117", "", new BigDecimal(100), 1, 2);

        System.out.println("\r\n模拟测试场景：支付宝支付、指纹方式。");
        payService.doPay("zfb_20230117", "", new BigDecimal(100), 2, 3);
    }
}

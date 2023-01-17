package cn.itdebug;

import cn.itdebug.channel.Pay;
import cn.itdebug.channel.WxPay;
import cn.itdebug.channel.ZfbPay;
import cn.itdebug.mode.PayFaceMode;
import cn.itdebug.mode.PayFingerprintMode;
import org.junit.Test;

import java.math.BigDecimal;

public class ApiTest {

    @Test
    public void test_pay() {
        System.out.println("\r\n模拟测试场景: 微信支付，人脸方式。");
        Pay wxPay = new WxPay(new PayFaceMode());
        wxPay.transfer("weixin_20230117", "", new BigDecimal(100));

        System.out.println("\r\n模拟测试场景: 支付宝支付，指纹方式。");
        Pay zfbPay = new ZfbPay(new PayFingerprintMode());
        zfbPay.transfer("zfb_20230117", "", new BigDecimal(100));
    }

}

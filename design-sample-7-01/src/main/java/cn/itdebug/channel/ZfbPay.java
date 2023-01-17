package cn.itdebug.channel;

import cn.itdebug.mode.IPayMode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigDecimal;

public class ZfbPay extends Pay {

    Logger logger = LoggerFactory.getLogger(ZfbPay.class);
    public ZfbPay(IPayMode payMode) {
        super(payMode);
    }

    @Override
    public String transfer(String uId, String tradeId, BigDecimal amount) {
        logger.info("模拟支付宝渠道支付划账开始。uId: {} tradeId: {} amount: {}", uId, tradeId, amount);
        boolean security = payMode.security(uId);
        logger.info("模拟支付宝渠道支付风控校验。uId: {} tradeId: {} amount: {}", uId, tradeId, amount);
        if(!security) {
            logger.info("模拟支付宝渠道支付划账拦截。uId: {} tradeId: {} amount: {}", uId, tradeId, amount);
            return "0001";
        }
        logger.info("模拟支付宝渠道支付划账成功。uId: {} tradeId: {} amount: {}", uId, tradeId, amount);
        return "0002";
    }
}

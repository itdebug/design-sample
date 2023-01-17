package cn.itdebug.service;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private Logger logger = LoggerFactory.getLogger(OrderService.class);

    public long queryUserOrderCount(String userId) {
        logger.info("自营商家，查询用户的订单是否为首单：{}", userId);
        return 10l;
    }
}

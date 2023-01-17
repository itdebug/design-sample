package cn.itdebug.impl;

import cn.itdebug.OrderAdapterService;
import cn.itdebug.service.OrderService;

public class InsideOrderService implements OrderAdapterService {

    OrderService orderService = new OrderService();

    @Override
    public boolean isFirst(String uId) {
        return orderService.queryUserOrderCount(uId) <= 1;
    }
}

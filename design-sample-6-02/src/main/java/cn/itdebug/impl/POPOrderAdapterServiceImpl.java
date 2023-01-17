package cn.itdebug.impl;

import cn.itdebug.OrderAdapterService;
import cn.itdebug.service.POPOrderService;

public class POPOrderAdapterServiceImpl implements OrderAdapterService {

    POPOrderService popOrderService = new POPOrderService();

    @Override
    public boolean isFirst(String uId) {
        return popOrderService.isFirstOrder(uId);
    }
}

package cn.itdebug;

import cn.itdebug.mq.OrderMq;
import com.alibaba.fastjson.JSON;

public class OrderMqService {

    public void onMessage(String message) {
        OrderMq mq = JSON.parseObject(message, OrderMq.class);
        mq.getUid();
        mq.getOrderId();
        mq.getCreateOrderTime();

        //其它业务处理
    }
}

package cn.itdebug;

import cn.itdebug.mq.POPOrderDelivered;
import com.alibaba.fastjson.JSON;

public class POPOrderDeliveredService {

    public void onMessage(String message) {
        POPOrderDelivered mq = JSON.parseObject(message, POPOrderDelivered.class);
        mq.getuId();
        mq.getOrderId();
        mq.getOrderTime();

        //其它业务处理
    }
}

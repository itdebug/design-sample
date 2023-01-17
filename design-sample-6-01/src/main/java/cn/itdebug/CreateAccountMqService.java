package cn.itdebug;

import cn.itdebug.mq.CreateAccount;
import com.alibaba.fastjson.JSON;

public class CreateAccountMqService {

    public void onMessage(String message) {
        CreateAccount mq = JSON.parseObject(message, CreateAccount.class);
        mq.getNumber();
        mq.getAccountDate();

        //业务处理
    }
}

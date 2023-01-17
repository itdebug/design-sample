package cn.itdebug;

import cn.itdebug.impl.InsideOrderService;
import cn.itdebug.impl.POPOrderAdapterServiceImpl;
import cn.itdebug.mq.CreateAccount;
import cn.itdebug.mq.OrderMq;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class ApiTest {

    @Test
    public void test_MQAdapter() throws ParseException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = s.parse("2020-06-01 23:20:16");

        CreateAccount createAccount = new CreateAccount();
        createAccount.setNumber("100001");
        createAccount.setAddress("上海市");
        createAccount.setAccountDate(parse);
        createAccount.setDesc("在校开户");

        HashMap<String, String> link01 = new HashMap<>();
        link01.put("userId", "number");
        link01.put("bizId", "number");
        link01.put("bizTime", "accountDate");
        link01.put("desc", "desc");

        CommonInfo commonInfo = MQAdapter.filter(createAccount.toString(), link01);
        System.out.println("mq.create_account(适配前)" + createAccount);
        System.out.println("mq.create_account(适配后)" + JSON.toJSONString(commonInfo));

        OrderMq orderMq = new OrderMq();
        orderMq.setUid("100001");
        orderMq.setSku("CTL0001");
        orderMq.setOrderId("Pos000001");
        orderMq.setCreateOrderTime(parse);

        HashMap<String, String> link02 = new HashMap<>();
        link02.put("userId", "uid");
        link02.put("bizId", "orderId");
        link02.put("bizTime", "createOrderTime");

        CommonInfo commonInfo1 = MQAdapter.filter(orderMq.toString(), link02);
        System.out.println("mq.orderMq(适配前)" + orderMq);
        System.out.println("mq.orderMq(适配后)" + JSON.toJSONString(commonInfo1));
    }

    @Test
    public void test_itfAdapter() {
        POPOrderAdapterServiceImpl popOrderAdapterService = new POPOrderAdapterServiceImpl();
        System.out.println("判断首单，接口适配(POP): " + popOrderAdapterService.isFirst("100001"));

        OrderAdapterService insideOrderService = new InsideOrderService();
        System.out.println("判断首单，接口适配(自营)：" + insideOrderService.isFirst("100001"));
    }
}

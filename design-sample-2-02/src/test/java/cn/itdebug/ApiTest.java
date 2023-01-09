package cn.itdebug;

import cn.itdebug.factory.JDKProxy;
import cn.itdebug.impl.CtripAdapter;
import cn.itdebug.impl.ELKAdapter;
import org.junit.Test;

public class ApiTest {

    @Test
    public void test_cacheService() throws Exception {
        ICacheAdapter proxy_elk = JDKProxy.getProxy(ELKAdapter.class, new ELKAdapter());
        proxy_elk.set("user_name_01", "马斯克");
        String userName01 = proxy_elk.get("user_name_01");
        System.out.println("测试结果 => " + userName01);

        ICacheAdapter proxy_ctrip = JDKProxy.getProxy(CtripAdapter.class, new CtripAdapter());
        proxy_ctrip.set("user_name_02", "麻花疼");
        String userName02 = proxy_ctrip.get("user_name_02");
        System.out.println("测试结果 => " + userName02);
    }

    @Test
    public void test_cacheService_del() throws Exception {
        ICacheAdapter proxy_elk = JDKProxy.getProxy(ELKAdapter.class, new ELKAdapter());
        proxy_elk.del("user_name_01");

        ICacheAdapter proxy_ctrip = JDKProxy.getProxy(CtripAdapter.class, new CtripAdapter());
        proxy_ctrip.del("user_name_02");
    }
}

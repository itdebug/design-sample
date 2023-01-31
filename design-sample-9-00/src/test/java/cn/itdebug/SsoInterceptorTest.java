package cn.itdebug;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * SsoInterceptor Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @createTime: 01/31/2023
 */
public class SsoInterceptorTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: preHandle(String request, String response, Object handler)
     */
    @Test
    public void testPreHandle() throws Exception {
        //TODO: Test goes here...
        SsoInterceptor ssoInterceptor = new SsoInterceptor();
        String request = "zhangsanfuyoutiandi";
        boolean preHandle = ssoInterceptor.preHandle(request, "xxxx", "t");
        System.out.println("登录校验：" + request + (preHandle? " 放行" : " 拦截"));
    }


} 

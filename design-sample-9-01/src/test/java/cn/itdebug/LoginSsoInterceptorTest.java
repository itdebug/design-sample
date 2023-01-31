package cn.itdebug;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * LoginSsoInterceptor Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @createTime: 01/31/2023
 */
public class LoginSsoInterceptorTest {

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
        LoginSsoInterceptor loginSsoInterceptor = new LoginSsoInterceptor();
        String request = "1success1zhangsan";
        boolean b = loginSsoInterceptor.preHandle(request, "xxxxx", "t");
        System.out.println("登录校验: " + request + (b? " 放行":"拦截"));
    }


} 

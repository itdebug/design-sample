package cn.itdebug;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoInterceptor extends SsoDecorator {

    private Logger logger = LoggerFactory.getLogger(LoginSsoInterceptor.class);

    private static Map<String, String> authMap = new ConcurrentHashMap<>();

    static {
        authMap.put("zhangsan", "queryUserInfo");
        authMap.put("lisi", "queryUserInfo");
    }

    public LoginSsoInterceptor(HandlerInterceptor handlerInterceptor) {
        super(handlerInterceptor);
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        boolean success = super.preHandle(request, response, handler);
        if(!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = authMap.get(userId);
        return method.equals("queryUserInfo");
    }
}

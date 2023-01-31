package cn.itdebug;

public class SsoInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        // 模拟获取token
        String ticket = request.substring(1, 8);
        return ticket.equals("success");
    }
}

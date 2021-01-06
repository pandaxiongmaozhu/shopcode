package com.dingli.shop.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 登录拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler)
            throws Exception {
        // 获取请求的URL
        String url = request.getRequestURI();
        String token = request.getHeader("Authorization");
        // 判断Session中是否有用户数据，如果有，则返回true,继续向下执行
        if (token != null && !token.equalsIgnoreCase("null")) {
            return true;
        }
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
    }
}

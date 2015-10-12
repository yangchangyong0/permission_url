package com.ycy.interceptor;

/**
 * Created by Administrator on 2015/10/10 0010.
 */

        import org.springframework.web.servlet.HandlerInterceptor;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;

/**
 * 拦截器01
 */
public class HandlerInterceptor01 implements HandlerInterceptor{
    //执行handler之前：
    // 用户校验等等
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        return true;
    }
    //执行handler，返回modelAndView之前：
    //页面公共属性，视图信息
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }
    //执行handler后：
    //统一异常，性能监控等，统一日志
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}

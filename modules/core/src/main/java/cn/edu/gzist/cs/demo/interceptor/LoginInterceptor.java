package cn.edu.gzist.cs.demo.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;


/**
 * @author VVulpes
 * @CreateDate 2024/1/4
 * @ProjectDetails [P4·拦截器·演示代码]
 */
/*继承HandlerInterceptor接口,重写prehandle、以实现自定义拦截器功能↓*/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        System.out.println("LoginInterceptor");
        return true;
    }
}
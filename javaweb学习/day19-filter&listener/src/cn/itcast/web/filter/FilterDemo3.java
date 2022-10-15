package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/*
    过滤器的快速入门程序
 */

//@WebFilter("/*") //访问所有资源之前，都会执行该过滤器
public class FilterDemo3 implements Filter{
    /**
     * 在服务器启动后会创建Filter对象，调用init方法
     * @param filterConfig
     * @throws ServletException
     */
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init....");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter....");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    /**
     * 在服务器关闭后，Filter对象被销毁。若过服务器正常关闭，则会执行destory方法
     */
    @Override
    public void destroy() {
        System.out.println("destroy......");
    }
}

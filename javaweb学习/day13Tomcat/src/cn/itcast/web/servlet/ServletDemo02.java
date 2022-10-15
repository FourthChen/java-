package cn.itcast.web.servlet;

import javax.servlet.*;
import java.io.IOException;

public class ServletDemo02 implements Servlet {
    /**
     * 初始化方法，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init......");
    }

    /**
     *获取ServletConfig对象
     * ServletConfig：Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /**每一次Servlet被访问时，执行多次
     * 提供服务方法
     *
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    //提供服务
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("hello,servlet");
    }

    /**
     * 获取Servlet的一些信息，
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /**
     * 销毁方法
     * 在服务器正常关闭时，执行一次
     */
    @Override
    public void destroy() {
        System.out.println("destory.........");
    }
}

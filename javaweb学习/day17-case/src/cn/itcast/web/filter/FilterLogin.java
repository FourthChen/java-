package cn.itcast.web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*
    完成登录验证的过滤器
 */
@WebFilter("/*")
public class FilterLogin implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

        //0.强制转换
        HttpServletRequest request=(HttpServletRequest) req;
        //1.获取资源请求的路径
        String uri = request.getRequestURI();
        //2.判断是否包含登录相关的资源路径
        if (uri.contains("/login.jsp")||uri.contains("/loginServlet")||uri.contains("/css/")|| uri.contains("/js/")||uri.contains("/font/")||uri.contains("checkCodeServlet")){
            //包含，用户就是想去登录，放行
            chain.doFilter(req,resp);
        }else{
            //不包含，需要就验证用户是否要登录
            //3.从session中获取user
            Object user = request.getSession().getAttribute("user");
            if (user!=null){
                //登录了，放行
                chain.doFilter(req,resp);
            }else {
                //没有登录，跳转到登录页面
                request.setAttribute("login_msg","您尚未登录，请登录");
                request.getRequestDispatcher("/login.jsp").forward(request,resp);
            }
        }

//        chain.doFilter(req, resp);

    }

    public void init(FilterConfig config) throws ServletException {

    }

}

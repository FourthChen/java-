package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/*
演示request对象获取请求行数据
 */
@WebServlet("/requestDemo6")
public class RequestDemo6 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //post 请求参数
        //根据参数名称获取参数值
        String username = request.getParameter("username");
//        System.out.println("post");
//        System.out.println(username);
        //根据参数名称获取参数值的数组
        String[] hobbies = request.getParameterValues("hobby");
//        for (String hobby : hobbies) {
//            System.out.println(hobby);
//        }
        //获取所有请求的参数名称
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String name = headerNames.nextElement();
            System.out.println(name);
            String value = request.getParameter(name);
            System.out.println("---------");
            System.out.println(value);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ///get 请求参数
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
//        this.doPost(request,response);
    }
}

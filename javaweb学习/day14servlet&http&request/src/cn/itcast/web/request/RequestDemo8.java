package cn.itcast.web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/*
演示request对象获取请求行数据
 */
@WebServlet("/requestDemo8")
public class RequestDemo8 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("demo8被访问了..........");

        //转发到demo9资源
        request.getRequestDispatcher("/requestDemo9").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ///get 请求参数
//        String username = request.getParameter("username");
//        System.out.println("get");
//        System.out.println(username);
//        this.doPost(request,response);
    }
}

package cn.itcast.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/responseDemo4")
public class ResponseDemo4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取流之前，设置流的默认编码
//        response.setCharacterEncoding("utf-8");

        //告诉浏览器，服务器发送的消息体数据的编码，建议浏览器使用该编码解码
//        response.setHeader("content-type","test/html;charset=utf-8");

        //简单形式
        response.setContentType("text/html;charset=utf-8");
        //1.获取字符输出流
        PrintWriter pw = response.getWriter();
        //2.输出数据
        pw.write("你好,response");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}

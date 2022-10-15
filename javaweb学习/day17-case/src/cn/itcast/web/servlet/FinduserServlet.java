package cn.itcast.web.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.Impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/finduserServlet")
public class FinduserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.获取id
        String id = request.getParameter("id");
        //2.调用service查询
        UserServiceImpl service = new UserServiceImpl();
        User user=service.findUserByid(id);
        //3.将user存入request
        request.setAttribute("user",user);
        //4.转发到update.jsp

        request.getRequestDispatcher("/update.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

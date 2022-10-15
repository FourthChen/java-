package cn.itcast.web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取用户名
        String username = request.getParameter("username");

        //调用service层判断用户名是否存在
        //期望服务器响应回的数据格式：{"userExist":true,"msg":"此用户名太受欢迎，请更换一个"}
        //                              {"userExist":false,"msg":"此用户名可用"}
        response.setContentType("text/html;charset=utf-8");
        Map<String, Object> map = new HashMap<String, Object>();
        if ("tom".equals(username)){
            //存在
            map.put("userExist",true);
            map.put("msg","此用户名太受欢迎，请更换一个");
        }else {
            //不存在
            map.put("userExist",false);
            map.put("msg","此用户名可用");
        }
        //将map转化为json，并传递给服务端
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(response.getWriter(),map);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}

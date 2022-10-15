package com.itheima.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.User;
import com.itheima.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller//放入容器中

@RequestMapping("/user")//给当前方法的地址拼接到一起，组成访问路径
public class UserController {
    @RequestMapping(value = "/quick22")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save22(String username, MultipartFile uploadFile1, MultipartFile uploadFile2) throws Exception{
        System.out.println(username);

        //获得上传文件的名称
        String originalFilename1 = uploadFile1.getOriginalFilename();
        uploadFile1.transferTo(new File("C:\\upload\\"+originalFilename1));
        //获得上传文件的名称
        String originalFilename2 = uploadFile2.getOriginalFilename();
        uploadFile2.transferTo(new File("C:\\upload\\"+originalFilename2));
    }
    @RequestMapping(value = "/quick21")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save21(@CookieValue(value = "JSESSIONID") String jsessionId) throws Exception{
        System.out.println(jsessionId);
    }
    @RequestMapping(value = "/quick20")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save20(@RequestHeader(value = "User-Agent",required = false) String user_agent) throws Exception{
        System.out.println(user_agent);
    }
    @RequestMapping(value = "/quick19")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save19(HttpServletRequest request,HttpServletResponse response,HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
    }
    //演示日期类型
    @RequestMapping(value = "/quick18")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save18(Date date) throws Exception{
        System.out.println(date);
    }
    //localhost:8080/user/quick17/zhangsan
    @RequestMapping(value = "/quick17/{username}")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save17(@PathVariable(value = "username") String username) throws Exception{
        System.out.println(username);
    }
    //获得基本类型参数
    @RequestMapping(value = "/quick16")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save16(@RequestParam("name") String username) throws Exception{
        System.out.println(username);
    }
    //获得集合类型参数
    @RequestMapping(value = "/quick15")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save15(@RequestBody List<User> userList) throws Exception{
        System.out.println(userList);
    }
    //获得集合类型参数
    @RequestMapping(value = "/quick14")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save14(VO vo) throws Exception{
        System.out.println(vo);
    }
    //获得数组类型参数
    @RequestMapping(value = "/quick13")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save13(String[] strs) throws Exception{
        System.out.println(Arrays.asList(strs));
    }
    //获得POJO类型参数
    @RequestMapping(value = "/quick12")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save12(User user) throws Exception{
        System.out.println(user);
    }
    //获得基本类型参数
    @RequestMapping(value = "/quick11")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public void save11(String username,int age) throws Exception{
        System.out.println(username);
        System.out.println(age);
    }
    @RequestMapping(value = "/quick10")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    //期望SpringMVC 自动将User转换成json格式的字符串
    public User save10() throws Exception{
        User user=new User();
        user.setUsername("lisi");
        user.setAge(18);

        return user;
    }
    @RequestMapping(value = "/quick9")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public String save9() throws Exception{
        User user=new User();
        user.setUsername("lisi");
        user.setAge(18);
        //使用json的转换工具将对象转换为json格式字符串在返回
        ObjectMapper objectMapper=new ObjectMapper();
        String json = objectMapper.writeValueAsString(user);
        return json;
    }

    @RequestMapping(value = "/quick8")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public String save8() throws Exception{

        return "{\"username\":\"zhangsan\",\"age\":18}";
    }
    @RequestMapping(value = "/quick7")//请求映射,
    @ResponseBody// 告知SpringMVC框架，方法返回的字符串不是跳转是直接在http响应体中返回。
    public String save7() throws Exception{

        return "hello itheima";
    }
    @RequestMapping(value = "/quick6")//请求映射,
    public void save6(HttpServletResponse response) throws Exception{
        response.getWriter().print("hello itcast");
    }

    @RequestMapping(value = "/quick5")//请求映射,
    public String save5(HttpServletRequest request) {
        request.setAttribute("username", "酷丁鱼");
        return "success";
    }

    @RequestMapping(value = "/quick4")//请求映射,
    public String save4(Model model) {
        model.addAttribute("username", "博学谷");
        return "success";
    }

    @RequestMapping(value = "/quick3")//请求映射,
    public ModelAndView save3(ModelAndView modelAndView) {
        /*
            Model:模型  作用封装数据
            View：视图  作用展示数据
         */
        //设置模型数据
        modelAndView.addObject("username", "itheima");
        //设置视图名称
        modelAndView.setViewName("success");

        return modelAndView;
    }

    @RequestMapping(value = "/quick2")//请求映射,
    public ModelAndView save2() {
        /*
            Model:模型  作用封装数据
            View：视图  作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username", "itcast");
        //设置视图名称
        modelAndView.setViewName("success");
        return modelAndView;
    }

    // 请求地址  http://localhost:8080/user/quick,请求时必须携带params = {"username"}参数
    @RequestMapping(value = "/quick", method = RequestMethod.GET, params = {"username"})//请求映射,
    public String save() {
        System.out.println("Controller save running....");
        return "success";
    }

}

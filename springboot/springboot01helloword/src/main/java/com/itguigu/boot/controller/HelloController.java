package com.itguigu.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody  //代表返回方法中的数据直接写在浏览器上
//@Controller

//@RestController=@ResponseBody+@Controller
@RestController
public class HelloController {
    @ResponseBody
    //映射请求
    @RequestMapping("/hello")
    public String handle01(){
        return "hello,Springboot";
    }
}

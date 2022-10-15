package cn.itnanls.studyspringboot.controller;


import cn.itnanls.studyspringboot.entity.Cat;
import cn.itnanls.studyspringboot.entity.User;
import cn.itnanls.studyspringboot.entity.Vip;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class UserController {

    @Resource
    private User user;

    @Resource
    private Cat cat;

    @Resource
    private Vip vip;



    @GetMapping("hello")
    public String hello(){
        System.out.println(vip);
        return user.getName();
    }
}

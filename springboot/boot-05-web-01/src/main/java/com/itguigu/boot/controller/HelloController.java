package com.itguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/1.jpg")
    public String hello(){
        return "aaaa";
    }
}

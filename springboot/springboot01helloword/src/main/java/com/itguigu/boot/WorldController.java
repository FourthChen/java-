package com.itguigu.boot;

import com.itguigu.boot.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorldController {

    @Autowired
    Car car;
    @RequestMapping("/car")
    public Car car(){
        return car;
    }
    @RequestMapping("/w")
    public String world(){
        return "world";
    }
}

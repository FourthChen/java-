package com.itheima.anno;


import org.springframework.stereotype.Component;


@Component("target")
//目标类
public class Target implements TargetInterface {

//    int i=1/0;//用来测试异常
    public void save() {
        System.out.println("save  running.....");
    }
}

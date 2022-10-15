package com.itheima.proxy.jdk;

//目标类
public class Target implements TargetInterface {
    public void save() {
        System.out.println("save  running.....");
    }
}

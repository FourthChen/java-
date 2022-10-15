package cn.itcast.day15.demo02SetName;

import cn.itcast.day15.demo01GetName.MyThread;

public class demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt=new MyThread();
        mt.start();
        mt.setName("小强");

        //开启多线程
        new cn.itcast.day15.demo02SetName.MyThread("翠花").start();
    }
}

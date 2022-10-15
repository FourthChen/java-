package cn.itcast.day06.demo01;

/*
定义一个类，用来模拟“学生事务”

属性（是什么）
    姓名
    年龄
行为（能做什么）
    吃饭
    睡觉
    学习

对应到java的类中，
    成员变量（属性）
    成员方法 (行为)  无static

* */
public class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public void eat(){
        System.out.println("学习");

    }
    public void sleep(){
        System.out.println("睡觉");

    }
    public void study(){
        System.out.println("学习");
    }

}

package cn.itcast.day09.demo06;

/*
* 抽象方法：就是加上abstract关键词，然后去掉大括号，直接分号结束
* 抽象类：抽象方法所在的类，必须是抽象类
*
* 如何使用抽象类和抽象方法？
*   1.不能直接创建new抽象类对象重写抽象父类中所有的抽象方法
*   2.必须用一个子类来继承抽象父类
*   3.子类必须覆盖重写抽象父类中所有的抽象方法
*   4.创建子类对象使用
* */
public abstract class animal {
    //这是一个抽象方法
    public abstract void eat();
    //普通的成员方法
    public void normalMethod(){

    }
}

package cn.itcast.day12.Calendar;

import java.util.Calendar;

/*
* `java.util.Calendar`是日历类，
* 在Date后出现，替换掉了许多Date的方法。
* 该类将所有可能用到的时间信息封装为静态成员变量，方便获取。日历类就是方便获取各个时间属性的。
*
* Calendar为抽象类，由于语言敏感性，Calendar类在创建对象时并非直接创建，而是通过静态方法创建，返回子类对象，如下：

Calendar静态方法

* `public static Calendar getInstance()`：使用默认时区和语言环境获得一个日历
* */
public class demo01Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance(); //多态
        System.out.println(c);
    }
}

package cn.itcast.day12.Date类;

import java.util.Date;

public class demo02Date {
    public static void main(String[] args) {
        demo03();
    }
    /*
    * long getTime() 把日期转化为毫秒值
    * */
    private static void demo03() {
        Date date=new Date();
        long time=date.getTime();
        System.out.println(time);
    }

    /*
    * Date类的带参构造方法
    * Date(long date)：传递毫秒值，把毫秒值转换为Date日期
    * */
    private static void demo02() {
        Date date=new Date(0L);
        System.out.println(date);//Thu Jan 01 08:00:00 CST 1970
    }

    /*
    * Date类的空参数构造方法
    * Date（）获取当前系统的日期和时间
    * */
    private static void demo01() {
        Date date=new Date();
        System.out.println(date);//Mon Aug 17 17:22:38 CST 2020
    }
}

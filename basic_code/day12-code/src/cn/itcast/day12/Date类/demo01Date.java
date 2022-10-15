package cn.itcast.day12.Date类;
/*
* java.util.Date:表示日期和时间的类
* 类Date表示特定的瞬间，精确到毫秒
* 毫秒：千分之一秒，1000毫米=1秒
* 特定的瞬间
*
*
* 毫秒的作用：可以对时间和日期进行计算
* 1999-09-01到2099-03-12之间有多少天
* 可以先把日期转化为毫秒进行计算，再把毫秒转化为日期
*
* 把日期转换为毫秒：
*   当前的日期：2020-8-17
*   时间原点（0毫秒）：1970年1月1日 00：00：00（英国格林威治）
*   就是计算当前日期到时间原点之间一共经历了多少毫秒
*
* 注意：
*       中国属于东八区，会把时间增加8个小时
* */
public class demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到时间原点经历了多少毫秒
    }
}

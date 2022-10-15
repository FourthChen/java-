package 各个杂类;

import java.util.Calendar;

//用程序判断2018年2月14日是星期几
public class demo06Ex06 {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        ////将给定的日历字段设置到Calendar对象中
        c.set(Calendar.YEAR,2020);
        c.set(Calendar.MONDAY,8);
        c.set(Calendar.DATE,18);
        //设置年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DATE);
        //设置星期
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        //输出结果
        System.out.println(year+"年"+month+"月"+date+"日是星期"+week);
    }
    //定义方法，获取星期汉字
    public static char getWeek(int a){
        char[] c = {' ','日','一','二','三','四','五','六'};
        return c[a];
    }
}

package 各个杂类;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
请用代码实现:获取当前的日期,并把这个日期转换为指定格式的字符串,
如2088-08-08 08:08:08。
 */
public class demo04Ex04 {
    public static void main(String[] args) {
        //获取当前的日期
        Date date = new Date();
        //创建SimpleDateFormat对象 df,并制定日期格式
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        ////调用df的format(Date  date) 方法,传入now; 接收返回的字符串
        String format = df.format(date);
        System.out.println(format);
    }
}

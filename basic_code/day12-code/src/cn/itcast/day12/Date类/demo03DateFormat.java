package cn.itcast.day12.Date类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
* java.text.DateFormat:是日期/时间格式化子类的抽象类
*   作用：
*       格式化（时间-->文本），解析（文本-->日期）
*   成员方法：
*       String format(Date date) 把日期格式化为字符串
*       Date parse(String source) 把字符串解析为Date日期
*   DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat类的子类
*
*   java.text.SimpleDateFormat 继承了DateFormat
*
*   构造方法：
*       SimpleDateFormat（String pattern）
*           pattern为指定的模式
*           y 年
*           M 月
*           d 日
*           H 时
*           m 分
*        写对应的模式，会把模式转换为对应的日期和时间
*        ”yyyy-MM-dd HH:mm:ss“
* */
public class demo03DateFormat {
    public static void main(String[] args) throws ParseException {
        demo02();
    }
    //解析
    /*
         使用DateFormat类中的方法parse,把文本解析为日期
         使用步骤:
            1.创建SimpleDateFormat对象,构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法parse,把符合构造方法中模式的字符串,解析为Date日期
            注意:
                public Date parse(String source) throws ParseException
                parse方法声明了一个异常叫ParseException
                如果字符串和构造方法的模式不一样,那么程序就会抛出此异常
                调用一个抛出了异常的方法,就必须的处理这个异常,要么throws继续抛出这个异常,要么try catch自己处理
     */
    private static void demo02() throws ParseException {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=sdf.parse("2020-08-17 18:12:05");
        System.out.println(date);
    }
    //格式化
    /*
    使用DateFormat类中的方法format,把日期格式化为文本
    使用步骤:
            1.创建SimpleDateFormat对象,构造方法中传递指定的模式
            2.调用SimpleDateFormat对象中的方法format,按照构造方法中指定的模式,把Date日期格式化为符合模式的字符串(文本)
     */
    private static void demo01() {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date=new Date();
        //格式化后的
        String d=sdf.format(date);
        System.out.println(date);
        System.out.println(d);
    }
}

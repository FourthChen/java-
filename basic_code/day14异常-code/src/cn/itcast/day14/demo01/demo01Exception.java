package cn.itcast.day14.demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:类是 Java 语言中所有错误或异常的超类。
        Exception:编译期异常,进行编译(写代码)java程序出现的问题
            RuntimeException:运行期异常,java程序运行过程中出现的问题
            异常就相当于程序得了一个小毛病(感冒,发烧),把异常处理掉,程序可以继续执行(吃点药,继续革命工作)
        Error:错误
            错误就相当于程序得了一个无法治愈的毛病(非典,艾滋).必须修改源代码,程序才能继续执行
 */
public class demo01Exception {
    public static void main(String[] args) /*throws ParseException*/ {
        //Exception:编译期异常,进行编译(写代码)java程序出现的问题
//        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");//用来格式化日期
//        Date date = null;//把字符串格式的日期，解析为Date格式的日期
//        try {
//            date = sdf.parse("1999-09-09");
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//        System.out.println(date);
//          int[] arr={1,2,3};
//          try {
//              //可能会出现异常的代码
//              System.out.println(arr[3]);
//          }catch (Exception e){
//              //异常的处理逻辑
//              System.out.println(e);
//          }

        //error：错误
        int[] arr=new int[1024*1024*1024];//内存溢出
        System.out.println("后续代码");
    }
}

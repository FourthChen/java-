package cn.itcast.day07.demo01;

import java.util.Scanner; //1.导包
/*
* Scanner类的功能是，可以实现键盘输入数据，到程序当中
*
* 引用类型的一般使用步骤：
*   1.导包
*       import 包路径.类名称;
*       若使用的目标类，和当前类位于同一个包下，则可以省略导包语句不写
*       只要java.lang包下的内容不需要导包
*   2.创建
*       类名称 对象名 =new 类名称();
*   3.使用
*       对象名.成员方法名();
* */
public class demo01Scanner {
    public static void main(String[] args) {
        //2.创建
        //备注：System.in表示从键盘输入
        //从键盘上获取int数字： int num =sc.nextInt();
        //从键盘上获取字符串：String str= sc.next();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int num=sc.nextInt();
        System.out.println("输入的数字是："+num);

        System.out.println("请输入字符串：" );
        String str=sc.next();
        System.out.println("输入的字符串是"+str);
    }
}

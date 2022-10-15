package cn.itcast.day07.demo02;

import java.util.Scanner;

public class demo02Anonymous {
    public static void main(String[] args) {
        //普通使用方式
//        Scanner sc= new Scanner(System.in);
//        int num=sc.nextInt();

        //匿名对象的方式

//        int num=new Scanner(System.in).nextInt();
//        System.out.println("输入的是："+num);
        //使用一般写法传入参数
        Scanner sc=new Scanner(System.in);
        MethodParame(sc);

        //使用匿名对象来进行传参
        MethodParame(new Scanner(System.in));
    }

    public static void MethodParame(Scanner sc){
        int num=sc.nextInt();
        System.out.println("输入的是："+num);
    }
}

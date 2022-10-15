package cn.itcast.day07.demo03;

import java.util.Random;

//题目:根据int变量n的值，来获取随机数字，范围是[1,n]
public class demo03Random {
    public static void main(String[] args) {
        Random r= new Random();

        int n=10;


        for (int i = 0; i < 100; i++) {
            int result=r.nextInt(n)+1;
            System.out.println(result);
        }
    }
}

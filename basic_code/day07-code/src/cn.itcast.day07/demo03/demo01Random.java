package cn.itcast.day07.demo03;
import java.util.Random;
public class demo01Random {
    public static void main(String[] args) {
        Random r= new Random();
        int num=r.nextInt();
        System.out.println("随机数为："+num);

        //有范围的
        int num1=r.nextInt(10);
        System.out.println("有区间的随机数为："+num1);
    }
}

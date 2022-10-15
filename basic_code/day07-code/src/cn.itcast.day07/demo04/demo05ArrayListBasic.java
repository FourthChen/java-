package cn.itcast.day07.demo04;

import java.util.ArrayList;
/*
* 若想要向集合存放数据，就要使用基本类型对应的”包装类“
*
* 从JDK1.5开始，支持自动装箱，拆箱
* */
public class demo05ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        ArrayList<Integer> listC=new ArrayList<>();
        listC.add(100);
        listC.add(200);
        System.out.println(listC);
        int num =listC.get(1);
        System.out.println("第一号元素是："+num);
    }
}

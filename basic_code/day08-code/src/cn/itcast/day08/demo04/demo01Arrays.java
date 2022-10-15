package cn.itcast.day08.demo04;

import java.util.Arrays;

/*
* Arrays是一个与数组相关地工具类，里面提高了大量地静态方法，用来实现数组常见地操作。
*
* public static String toString(数组)：将参数数组变成字符串
* public static void sort(数组):按照升序排序
* */
public class demo01Arrays {
    public static void main(String[] args) {
        int[] arrray={1,23,4};
        //将int[]数组变成字符串
        String intStr= Arrays.toString(arrray);


        //排序
        int[] array1={3,2,145,33,22};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

        String[] array2={"aaa","ccc","demo02SetName"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}

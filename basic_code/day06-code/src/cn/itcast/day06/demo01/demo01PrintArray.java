package cn.itcast.day06.demo01;

import java.util.Arrays;

public class demo01PrintArray {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1){
                System.out.println(array[i]+"]");
            }else{
                System.out.print(array[i]+", ");
            }
        }
        System.out.println("=======================================");
        //使用面向对象
        //其中有一个toString方法，直接把数组变为想要的格式z
        System.out.println(Arrays.toString(array));
    }
}

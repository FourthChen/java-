package cn.itcast.day05.demo03;

public class demo05ArrayMax {
    public static void main(String[] args) {
        int []  array={1,2,4,5,7};
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
               max=array[i] ;
            }

        }
        System.out.println("最大为："+max);
    }
}

package cn.itcast.day06.demo03;
/*
* 面向对象三大特性：封装，继承，多态
*
* 封装在java中的体现：
*   1.方法就是一种封装
*   2.关键词private也是一种封装
*
*
*   封装就是把一些细节信息隐藏起来，对于外界不可见
* */
public class demo02Method {
    public static void main(String[] args) {
        int [] array={ 5,10,20};

        int max=getMax(array);
        System.out.println("最大值："+max);
        System.out.println("============");
    }
    public static int getMax(int[] array){
        int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }
}

package cn.itcast.day05.demo03;

public class demo07ArrayParam {
    public static void main(String[] args) {
        int [] array={1,3,4,2};
        printArray(array);
    }
    public static void printArray(int [] array){
        System.out.println("printArray方法收到的是："+array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}



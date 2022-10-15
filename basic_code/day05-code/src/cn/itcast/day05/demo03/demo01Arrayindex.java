package cn.itcast.day05.demo03;

public class demo01Arrayindex {
    public static void main(String[] args) {
        int[] array={1,2,3};
        System.out.println(array[2]);
        //不存在四号元素，出现了索引越界异常
        System.out.println(array[4]);
    }
}

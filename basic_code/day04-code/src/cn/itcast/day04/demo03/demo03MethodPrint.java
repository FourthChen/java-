package cn.itcast.day04.demo03;

public class demo03MethodPrint {
    public static void main(String[] args) {
        printCount(4);
    }
    public static void printCount(int num){
        for (int i = 0; i < num; i++) {
            System.out.println("hello, world"+(i+1));
        }
    }
}

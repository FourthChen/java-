package cn.itcast.day04.demo02;

/*
定义格式：
public static void 方法名称{
    方法体
}
*/
public class demo01Method {
    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

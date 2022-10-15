package cn.itcast.day04.demo02;

/*
方法就是若干个语句的功能集合

参数;
返回值;

定义方法的完整格式；
修饰符 返回值类型 方法名称 （参数类型 参数类型,....）{
    方法体
    return 返回值
}
*/
public class demo2MethodDefine {
    public static void main(String[] args) {
        sum(1,2);
        System.out.println("==========");
        System.out.println(sum(10,20));

        int number=sum(10,40);
        System.out.println(number);
    }
    public static int sum(int a, int b){
        int result =a+b;
        return result;
    }
}

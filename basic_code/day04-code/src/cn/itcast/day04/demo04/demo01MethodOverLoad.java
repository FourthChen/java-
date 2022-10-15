package cn.itcast.day04.demo04;
/*
对于功能类似的方法，因为参数列表不一样，函数就不一样

引入方法的重载（overload）：多个方法的名称一样，但参数列表不一样

    参数个数不同是可以的
        类型不同是可以的

*/

public class demo01MethodOverLoad {
    public static void main(String[] args) {
//        System.out.println(sumtwo(1,3));
//        System.out.println(sumthree(12,3,4));
//        System.out.println(sumfour(5,3,26,4));
        System.out.println(sum(2132,4232,80));
    }
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }
}

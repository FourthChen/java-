package cn.itcast.test;

public class TestFactorial  {
    public static void main(String[] args) {
        //求n的阶乘
        long l = factorial(15);
        System.out.println("阶乘为："+l);
    }
    public static long factorial(int n){
        if (n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }
}

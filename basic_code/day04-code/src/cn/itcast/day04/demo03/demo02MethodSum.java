package cn.itcast.day04.demo03;
/* 求出1-100之间所有数字的和*/
public class demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(Sum());
    }

    public static int Sum(){
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum=sum+i;
        }
        return sum;
    }
}

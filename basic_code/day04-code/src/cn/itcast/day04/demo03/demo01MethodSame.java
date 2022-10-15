package cn.itcast.day04.demo03;
/* 判断两个数是否相同*/
public class demo01MethodSame {
    public static void main(String[] args) {
        boolean result=isSame(1,4);
        System.out.println(result);
    }

    public static boolean isSame(int a,int b){
        boolean same;
        if (a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }
}

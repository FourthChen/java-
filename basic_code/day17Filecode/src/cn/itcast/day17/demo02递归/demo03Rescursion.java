package cn.itcast.day17.demo02递归;
/*
    练习:
        使用递归计算阶乘
        n的阶乘：n! = n * (n-1) *...* 3 * 2 * 1

 */
public class demo03Rescursion {
    public static void main(String[] args) {
        long l = jiecheng(4);
        System.out.println(l);
    }

    private static long jiecheng(int i) {
        if (i==1){
            return 1;
        }

        return i*jiecheng(i-1);
    }

}

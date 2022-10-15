package cn.itcast.day08.demo04;
/*
* Math是数学相关的工具类，
*
* abs()   获取 绝对值
* ceil()  向上取整
* floor() 向下取整
* round() 四舍五入
* */
public class demo03Math {
    public static void main(String[] args) {
        System.out.println(Math.abs(3.2));
        System.out.println(Math.abs(-3.2));


        System.out.println(Math.ceil(5.4));
        System.out.println(Math.ceil(-5.4));

        System.out.println(Math.floor(9.8));

        System.out.println(Math.round(5.4));
    }
}

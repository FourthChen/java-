package cn.itcast.day11.demo01;
/*
* final 关键词代表最终，不可改变的
* 常见四种用法：
*   1.可以用来修饰一个类
*   2.可以用来修饰一个方法
*   3.可以用来修饰一个局部变量
*   4.可以用来修饰一个成员变量
* */
public class demo01Final {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num);
        num=20;
        System.out.println(num);

        //一旦使用final用来修饰局部变量，那么这个变量就不能改变
        final int num2=200;
        System.out.println(num2);

        Student stu=new Student("赵丽颖");
        System.out.println(stu.getName());
        stu=new Student("霍建华");
        System.out.println(stu.getName());
        System.out.println("================");
        //用final修饰过的，地址值不能变，而可以用setname（）函数改变值
        final Student stu2=new Student("高圆圆");

    }


}

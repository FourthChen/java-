package cn.itcast.day08.demo03;

/*
 * 静态代码块
 *
 * public class 类名称{
 *       static{
 *           静态代码块
 *       }
 * }
 *
 * 特点：当第一次用到本类时，静态代码块执行唯一的一次。
 *
 * 静态内容总是优先于非静态，所以静态代码块比构造方法先执行
 *
 * 静态代码块的典型用途：
 *      用来一次性地对静态成员变量进行赋值
 * */
public class demo04Static {
    public static void main(String[] args) {
        person one=new person();
        person two=new person();
    }
}

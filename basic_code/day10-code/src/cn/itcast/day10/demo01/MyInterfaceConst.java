package cn.itcast.day10.demo01;
/*
* 接口当中也可以定义“成员变量”,但是必须使用public static final 三个关键字进行修饰
* 从效果上看，这其实就是接口的【常量】
*
* public static final 数据类型 常量名称 = 数据值
*
*
* 常量的名称，使用完全大写的字母，用下划线进行分隔.
* */
public interface MyInterfaceConst {
    //这是一个常量，一旦赋值，不能修改
    public static final int NUM=10;


}

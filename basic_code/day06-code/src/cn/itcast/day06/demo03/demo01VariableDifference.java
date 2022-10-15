package cn.itcast.day06.demo03;

/*
* 局部变量和成员变量
*       1.定义位置不一样  ***
*           局部变量，写在方法的内部；
*           成员变量，写在方法的外部，直接写在类中
*       2.作用范围不一样  ***
*           局部变量，只有在方法中可以使用，出了方法就不能使用了
*           成员变量，在类中都可以通用
*       3.默认值不一样   ***
*           局部变量，没有默认值，若要使用，必须手动进行赋值
*           成员变量，若没有赋值，会有默认值
*       4.内存的位置不一样
*           局部变量，位于栈内存
*           成员变量，位于堆内存
*       5.生命周期不一样
*           局部变量，随着方法进栈而诞生，随着方法出栈而消失
*           成员变量，随着对象创建而诞生，随着对象被垃圾回收而消失
* */
public class demo01VariableDifference {
    String name;//成员变量

    public void method(){
        int num=10; //局部变量
        System.out.println(num);
    }
    public void methodB(int param){  //方法的参数就是局部变量
        System.out.println(param);//参数在方法调用的时候，必然会被赋值
        //System.out.println(num);   错误谢大
    }
}

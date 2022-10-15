package cn.itcast.day10.demo01;
/*
* 1.接口的默认方法，可以接口实现类对象，直接调用
* 2.接口的默认方法，也可以被接口实现类进行覆盖重写
* */
public class demo02interfaceDefault {
    public static void main(String[] args) {
        MyInterfaceDefaultA a=new MyInterfaceDefaultA();
        a.methodAbs();//调用抽象方法,实际运行的是右侧实现类

        a.methdDefault();

        MyInterfaceDefaultB b=new MyInterfaceDefaultB();
        b.methodAbs();
        b.methdDefault();
    }
}

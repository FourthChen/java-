package cn.itcast.day10.demo02;

public interface MyInterfaceB {
    //错误写法，接口不能有静态代码块
//    static {
//
//    }
    //接口不能有构造方法
//    public MyInterfaceA(){
//
//    }
    public abstract void  methodB();
    public abstract void methodabs();
}

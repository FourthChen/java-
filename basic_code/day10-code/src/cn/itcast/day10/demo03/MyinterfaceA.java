package cn.itcast.day10.demo03;

public interface MyinterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("AAAAAAA");
    }
}

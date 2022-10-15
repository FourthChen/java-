package cn.itcast.day10.demo03;

public interface MyinterfaceB {
    public abstract void methodB();
    public abstract void methodCommon();
    public default void methodDefault(){
        System.out.println("BBBBBBB");
    }
}

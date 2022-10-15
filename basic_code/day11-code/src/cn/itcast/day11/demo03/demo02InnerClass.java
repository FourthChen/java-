package cn.itcast.day11.demo03;

public class demo02InnerClass {
    public static void main(String[] args) {
        //创建内部类的公式
        Outer.Inner obj=new Outer().new Inner();
        obj.methodInner();
    }
}

package cn.itcast.day09.demo04;
/*
* 重写：方法的名称一样，参数列表也一样
* 重载：方法的名称一样，参数列表不一样
* */
public class demo01ExtendsMeth {
    public static void main(String[] args) {
        Zi zi=new Zi();
        zi.methodZi();
        zi.methodFu();

        zi.method();
    }
}

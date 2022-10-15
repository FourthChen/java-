package cn.itcast.day09.demo02;
/*
* 若父子类的继承关系中，如果成员变量重名后，访问规则：
*   直接：通过子类对象访问成员变量；
*       等号左边是谁，就优先用谁，没有则向上找
*   间接：通过成员方法访问成员变量；
*       该方法属于谁，就优先用谁，没有就向上找
* */
public class demo01ExtendsField {
    public static void main(String[] args) {
        Fu fu=new Fu();
        System.out.println(fu.numFu);

        Zi zi=new Zi();
        System.out.println(zi.numFu);//10
        System.out.println(zi.numZi);//20

        System.out.println("==============");
        System.out.println(zi.num);//优先子类
        System.out.println("==============");


        zi.methodZi();
        zi.methodFu();
    }
}

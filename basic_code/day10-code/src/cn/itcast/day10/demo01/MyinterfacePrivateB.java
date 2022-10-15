package cn.itcast.day10.demo01;
/*
* 问题描述：我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题
* 但这个公共方法不应该让实现类使用，应该是私有化的。
*
* 解决方法：
*   从java9开始：接口中允许定义私有方法
*       1.普通私有方法，解决多个默认方法之间重复代码问题
*           private 返回值类型 方法名称（参数列表）{
*               方法体
*           }
*       2.静态私有方法，解决多个静态方法之间重复代码问题
*           private static 返回值类型 方法名称(参数列表){
*               方法体
*           }
* */
public interface MyinterfacePrivateB {
    public static void methodDefault1(){
        System.out.println("静态方法1");

    }

    public static void methodDefault2(){
        System.out.println("静态方法2");

    }

    private  static void methodStaticCommon(){
        System.out.println("AAAA");
        System.out.println("BBBB");
    }
}

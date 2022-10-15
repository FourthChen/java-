package cn.itcast.day10.demo01;
/*
* 接口是多个类的公共规范
* 接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
*
* 如何定义一个接口的格式：
*   public interface 接口名称{
*       接口内容
*       }
*
* 备注：.java---> .class
*
* java7，包含的内容是;
*   1.常量
*   2.抽象方法
*
* 若是java8，还可以额外包括有：
*   3.默认方法
*   4.静态方法
* 若是java9，还可以包括：
*   5.私有方法
*
*  接口使用步骤：
*   1.接口不能直接使用，必须有一个实现类来实现该接口
*   格式：
*       public class 实现类名称 implements 接口名称{
*           ....
*       }
*   2.接口的实现必须覆盖重写（实现）接口中所有的抽象方法
*       实现：去掉abstract关键词，加上方法体大括号
*   3.创建实现类的对象，进行使用
*
* 注意事项：若实现类并没有覆盖接口中所有的抽象方法，那么这个现实类自己就必须是抽象类
*       */
public class demo01interface {
    public static void main(String[] args) {
        //创建实现类
        MyInterfaceAbstractImpl Impl=new MyInterfaceAbstractImpl();
        Impl.methodAbs();
        Impl.methodAbs1();
    }
}

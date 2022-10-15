package cn.itcast.day12.API;
/*
* `java.lang.Object`类是Java语言中的根类，即所有类的父类。
* 它中描述的所有方法子类都可以使用。在对象实例化的时候，最终找的父类就是Object*/
public class demo01ToString {
    public static void main(String[] args) {
        /*
        * person类默认继承了Object类，所以可以使用Object的toString方法
        *返回字符串
        * */
        Person p=new Person("张三",19);
        String s=p.toString();
        System.out.println(s); //cn.itcast.day12.API.Person@282ba1e

        //直接打印对象的名字，其实就是调用对象的toString

    }
}

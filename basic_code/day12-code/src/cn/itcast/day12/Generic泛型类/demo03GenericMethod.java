package cn.itcast.day12.Generic泛型类;
//测试含有泛型的方法
public class demo03GenericMethod {
    public static void main(String[] args) {
        //创建一个GenericMethod对象
        GenericMethod gm=new GenericMethod();

        gm.method01(1231);
        gm.method01("21");

        //静态方法，通过类名.方法名(参数)可以直接使用
        GenericMethod.method02("静态方法");
        GenericMethod.method02(1);
    }

}

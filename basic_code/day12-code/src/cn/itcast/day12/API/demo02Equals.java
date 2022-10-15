package cn.itcast.day12.API;

public class demo02Equals {


    public static void main(String[] args) {
        /*
         * person类默认继承了Object类，所以可以使用Object类的equals方法
         * 指示其他某个对象是否与此对象”相等“
         *   基本数据类型：比较的是值
         *   引用数据类型：比较的是地址
         *
         * */
        Person p1=new Person("古力娜扎",19);
        Person p2=new Person("古力娜扎",19);
        boolean b=p1.equals(p2);
        System.out.println(b);
    }
}

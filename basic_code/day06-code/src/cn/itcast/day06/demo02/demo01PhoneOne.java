package cn.itcast.day06.demo02;

public class demo01PhoneOne {
    public static void main(String[] args) {
        //根据Phone类，创建名为one的对象
        Phone one=new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("==============");
        one.brand="apple";
        one.color="红色";
        one.price=9000;
        System.out.println("==============");
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        one.call("tom");
        one.send();
    }
}

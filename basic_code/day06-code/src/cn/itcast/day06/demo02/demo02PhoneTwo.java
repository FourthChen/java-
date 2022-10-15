package cn.itcast.day06.demo02;

public class demo02PhoneTwo {
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
        System.out.println("=========================================");
        //根据Phone类，创建名为one的对象
        Phone two=new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("==============");
        two.brand="huawei";
        two.color="黑色";
        two.price=9000;
        System.out.println("==============");
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        two.call("张三");
        two.send();
    }
}

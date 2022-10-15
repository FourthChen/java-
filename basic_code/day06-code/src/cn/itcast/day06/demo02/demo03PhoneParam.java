package cn.itcast.day06.demo02;

public class demo03PhoneParam {
    public static void main(String[] args) {
        Phone one=new Phone();
        one.brand="apple";
        one.price=8000;
        one.color="黑色";
        method(one);
    }
    public static void method(Phone param){
        System.out.println(param.price);
        System.out.println(param.color);
        System.out.println(param.brand);
    }
}

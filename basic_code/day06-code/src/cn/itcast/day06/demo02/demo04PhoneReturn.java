package cn.itcast.day06.demo02;

public class demo04PhoneReturn {
    public static void main(String[] args) {
        Phone two=getPhone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
    }

    public static Phone getPhone(){
        Phone one=new Phone();
        one.color="red";
        one.price=7800;
        one.brand="huawei";
        return one;
    }
}

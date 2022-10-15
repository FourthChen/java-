package cn.itcast.day06.demo02;
/*
* 定义一个手机类，用来模拟“手机”事务；
*
* 属性：品牌，价格，颜色
* 行为：打电话，发短信
*
* 成员变量
*   String brand
*   double price
*   String color
* 成员方法
*   public void call(String who)
*   public void send()
*
* */
public class Phone {
    //成员变量
    String brand;
    double price;
    String color;

    public void call(String who){
        System.out.println("给"+who+"打电话");
    }
    public void send(){
        System.out.println("发短信");
    }
}

package cn.itcast.day07.demo02;

/*
* 创建对象的标准格式：
*   类名称 对象名=new 类名称();
*
*
* 匿名对象就是只有右边的对象，没有左边的名字
*   new 类名称;
*
*匿名对象只能使用一次
* */
public class demo01Anonymous {
    public static void main(String[] args) {
        person one=new person();

        one.name="高圆圆";
        one.showName();

        System.out.println("==================");
        //匿名对象
        new person().name="赵又廷";
        new person().showName();//我叫null
    }
}

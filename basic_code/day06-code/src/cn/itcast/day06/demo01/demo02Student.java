package cn.itcast.day06.demo01;

//通常情况下，一个类不能只能使用，需要创建一个对象，才能使用

/*
1.导包
    import 包名称.类名称
    import cn.itcast.day06.demo01GetName.Student
2.创建
    类名称 对象名 =new 类名称();
    Student stu=new Student();
3.使用(分为两种情况)
    使用成员变量：  对象名.成员变量名
    使用成员方法：  对象名.成员方法名
 */
public class demo02Student {
    public static void main(String[] args) {
        Student stu=new Student();
        System.out.println(stu.age);
        System.out.println(stu.name);
        stu.age=12;
        stu.name="赵丽颖";
        System.out.println("==================");
        System.out.println(stu.age);
        System.out.println(stu.name);
    }
}

package cn.itcast.day08.demo03;

public class demo03StaticStuent {
    public static void main(String[] args) {

        //首先设置一下教室，这是静态的东西，应该通过类名称进行调用
        student.room="101教室";
        student one=new student("郭靖",19);
        student two=new student("黄蓉",16);
        System.out.println("one的姓名："+one.getName());
        System.out.println("one的年龄："+one.getAge());
        System.out.println("one的教室："+student.room);
        System.out.println("========================");
        System.out.println("two的姓名："+two.getName());
        System.out.println("two的年龄："+two.getAge());
        System.out.println("two的教室："+student.room);
    }

}

package cn.itcast.day06.demo04;

public class demo02student {
    public static void main(String[] args) {
        student stu=new student();//无参构造

        student stu1=new student("张三",90);//全参构造
        System.out.println("姓名是："+stu1.getName()+",年龄是："+stu1.getAge());

        //若要改变对象中得成员变量数据内容，仍然需要使用setXXX方法

        stu1.setAge(21);
        System.out.println("姓名是："+stu1.getName()+",年龄是："+stu1.getAge());
    }
}

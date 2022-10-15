package cn.itcast.day08.demo03;

/*
* 若一个成员变量使用了static关键词，那么这个变量不再属于对象自己，而属于所在的类，多个对象共享同一份数据
* */
public class demo01StaticField {
    public static void main(String[] args) {
        student one=new student("郭靖",19);
        one.room="101教室";
        System.out.println("姓名："+one.getName()+",年龄："+one.getAge()+",教室："+one.room+",学号:"+one.getId());


        student two=new student("黄蓉",16);


        System.out.println("姓名："+two.getName()+",年龄："+two.getAge()+",教室："+two.room+",学号:"+two.getId());
    }
}

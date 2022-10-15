package cn.itcast.day06.demo05;

public class demo01stuent {
    public static void main(String[] args) {
        student stu=new student();
        stu.setAge(20);
        stu.setName("迪丽热巴");
        System.out.println("姓名："+stu.getName()+".年龄："+stu.getAge());
        System.out.println("==================");

        student stu2=new student("古力娜扎",23);
        System.out.println("姓名："+stu2.getName()+".年龄："+stu2.getAge());
    }
}

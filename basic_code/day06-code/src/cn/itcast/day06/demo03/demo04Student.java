package cn.itcast.day06.demo03;

public class demo04Student {
    public static void main(String[] args) {
        student stu=new student();
        stu.setName("鹿晗");
        stu.setAge(20);
        stu.setMale(true);

        System.out.println("姓名是："+stu.getName());
        System.out.println("年龄是："+stu.getAge());
        System.out.println("是不是爷们:"+stu.isMale());
    }

}
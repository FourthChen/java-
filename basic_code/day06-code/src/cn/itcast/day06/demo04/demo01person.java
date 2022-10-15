package cn.itcast.day06.demo04;

public class demo01person {
    public static void main(String[] args) {
        person person =new person();

        //设置自己的名字
        person.name="王健林";
        person.sayHello("王思聪");
        System.out.println(person);
    }
}

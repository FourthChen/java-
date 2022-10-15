package cn.itcast.day06.demo03;

public class demo03Person {
    public static void main(String[] args) {
        person person=new person();
        person.show();

        person.name="赵莉莉";
        //person.gage=19; 错误写法
        person.setAge(20);
        person.show();
    }
}

package cn.itcast.day06.demo05;

//一个标准通常要拥有下面四个组成部分：

//1.所有得成员变量要用private关键词修饰
//2.为每一个成员变量编写一对儿Getter/Setter方法
//3.编写一个无参数的构造方法
//4.编写一个全参数的构造方法


//这样标准的类叫做java Bean
public class student {
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

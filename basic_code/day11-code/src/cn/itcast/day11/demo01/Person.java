package cn.itcast.day11.demo01;
/*
* 对于成员变量来说，若使用final关键词修饰，那么这个变量也照样是不可变的
*
* 1.由于成员变量具有默认值，用了final后必须手动赋值，不会再给默认值了
* 2.对于final的成员变量，要么使用直接赋值，要么通过构造方法赋值
* */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

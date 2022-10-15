package cn.itcast.day12.API;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
    }
    /*
    *
    * 直接打印对象的地址值没有意义，需要重写Object类中的toString方法
    * 打印对象的属性（name，age）
    * */

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    //Object类中的equals方法比较的是两个对象的地址值，没有意义
    //重写equals方法，比较两个对象的属性（name，age）
        //问题：1.隐含多态，无法使用子类特有的内容

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false; //反射技术
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

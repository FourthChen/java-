package cn.itcast.day13.set;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */
public class demo03HashSetSavePerson {
    public static void main(String[] args) {
        //创建HashSet集合存Person
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("小美女",18);
        Person p2=new Person("小帅哥",19);
        Person p3=new Person("小美女",18);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
        System.out.println(p1==p3);
    }
}

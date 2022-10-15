package cn.itcast.day12.Collection集合;

import java.util.ArrayList;
import java.util.Collection;

/*
        java.util.Collection接口
        所有单列集合的最顶层的接口,里边定义了所有单列集合共性的方法
        任意的单列集合都可以使用Collection接口中的方法


        共性的方法:
            public boolean add(E e)：  把给定的对象添加到当前集合中 。
            public void clear() :清空集合中所有的元素。
            public boolean remove(E e): 把给定的对象在当前集合中删除。
            public boolean contains(E e): 判断当前集合中是否包含给定的对象。
            public boolean isEmpty(): 判断当前集合是否为空。
            public int size(): 返回集合中元素的个数。
            public Object[] toArray(): 把集合中的元素，存储到数组中。
        */
public class demo01Collection {
    public static void main(String[] args) {
        //创建一个集合对象，可以使用多态
        Collection <String> coll=new ArrayList<>();
        System.out.println(coll);//若打印的不是地址，那他就重写了toString方法

        //添加元素
        boolean b1=coll.add("abc");
        System.out.println("b1:"+b1);//b1:true
        coll.add("bcd");
        coll.add("cde");
        coll.add("def");
        coll.add("efg");

        System.out.println(coll);//[abc, bcd]

        //删除元素,若不存在元素，则删除失败
        boolean b2=coll.remove("abc");
        System.out.println(b2);
        System.out.println(coll);

        //判断集合是否为空
        boolean b6=coll.isEmpty();
        System.out.println("b6:"+b6); //集合为空，返回false

        //返回集合中元素的个数
        int size=coll.size();
        System.out.println("集合元素个数为："+size);

        //把集合中的元素，存储到数组中。
        Object[] arr=coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //清空集合中所有的元素,但不删除集合
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());//判断集合是否为空
    }
}

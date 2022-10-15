package cn.itcast.day13.list;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢,增删快
        2.里边包含了大量操作首尾元素的方法
        注意:使用LinkedList集合特有的方法,不能使用多态

        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。

        - public E getFirst():返回此列表的第一个元素。
        - public E getLast():返回此列表的最后一个元素。

        - public E removeFirst():移除并返回此列表的第一个元素。
        - public E removeLast():移除并返回此列表的最后一个元素。
        - public E pop():从此列表所表示的堆栈处弹出一个元素。

        - public boolean isEmpty()：如果列表不包含元素，则返回true。

 */
public class demo02LinkedList {
    public static void main(String[] args) {
        demo03();
    }
    /*
            - public E removeFirst():移除并返回此列表的第一个元素。
            - public E removeLast():移除并返回此列表的最后一个元素。
            - public E pop():从此列表所表示的堆栈处弹出一个元素。此方法相当于 removeFirst
         */
    private static void demo03() {
        //创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<>();
        //使用add方法往集合中添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        String s = linked.removeFirst();
        System.out.println("被移除的第一个元素："+s);
        String s1 = linked.removeLast();
        System.out.println("被移除的最后一个元素："+s1);
    }

    /*
            - public E getFirst():返回此列表的第一个元素。
            - public E getLast():返回此列表的最后一个元素。
         */
    private static void demo02() {
        //创建LinkedList对象
        LinkedList<String> linked = new LinkedList<>();
        //用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        
        if (linked.isEmpty()){
            String first = linked.getFirst();
            System.out.println(first);
            String last = linked.getLast();
            System.out.println(last);
        }

    }

    /*
        - public void addFirst(E e):将指定元素插入此列表的开头。
        - public void addLast(E e):将指定元素添加到此列表的结尾。
        - public void push(E e):将元素推入此列表所表示的堆栈。此方法等效于 addFirst(E)。
     */
    private static void demo01() {
        //创建LinkedList对象
        LinkedList<String> linked = new LinkedList<>();
        //用add方法添加元素
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]

        //public void addFirst(E e):将指定元素插入此列表的开头。
        linked.addFirst("first");
        System.out.println(linked);
        linked.push("1");//与addfirst方法效果一样
        System.out.println(linked);

        linked.addLast("last");
        System.out.println(linked);
    }
}

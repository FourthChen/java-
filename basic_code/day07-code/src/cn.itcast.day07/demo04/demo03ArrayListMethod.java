package cn.itcast.day07.demo04;


import java.util.ArrayList;

/*
* ArrayList当中常用的方法：
*   public boolean add( E e)   添加元素
*   public E get(int index)    获取元素
*   public E remove(int index) 删除元素
*   public int size();         获取集合的长度
* */
public class demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);

        //向集合添加
        boolean success=list.add("刘岩");
        System.out.println("添加的动作是否成功"+success);
        list.add("高圆圆");
        list.add("赵又廷");
        list.add("李小璐");
        System.out.println(list);

        String name=list.get(2);
        System.out.println("第二号位置是："+name);
        //删除
        String whpRemove=list.remove(3);
        System.out.println("被删的人是："+whpRemove);

        int size=list.size();
        System.out.println("集合的长度是："+size);

    }
}


package cn.itcast.test;

import cn.itcast.linear.TwoWayLinkList;

public class TwoWayLinkListTest {
    public static void main(String[] args) {
        TwoWayLinkList<String> list = new TwoWayLinkList<>();
        list.insert("乔峰");
        list.insert("虚竹");
        list.insert("段誉");
        list.insert(1,"鸠摩智");
        list.insert(3,"叶二娘");
        for (Object arr:list){
            System.out.println(arr);
        }
        System.out.println("----------------------");
        String tow = list.get(2);
        System.out.println(tow);
        System.out.println("-------------------------");
        String remove = list.remove(3);
        System.out.println(remove);
        System.out.println(list.length());
        System.out.println("--------------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}

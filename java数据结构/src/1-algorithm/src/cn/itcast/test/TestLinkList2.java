package cn.itcast.test;

import cn.itcast.linear.LinkList;

public class TestLinkList2 {
    public static void main(String[] args) {
        //创建单向链表表对象
        LinkList<String> s1 = new LinkList<>();
        //测试插入
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");


        System.out.println("-----------------------");

        s1.reverse();

    }
}

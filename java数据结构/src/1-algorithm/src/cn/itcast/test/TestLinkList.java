package cn.itcast.test;

import cn.itcast.linear.LinkList;

public class TestLinkList {
    public static void main(String[] args) {
        //创建顺序表对象
        LinkList<String> s1 = new LinkList<>();
        //测试插入
        s1.insert("姚明");
        s1.insert("科比");
        s1.insert("麦迪");
        s1.insert(1,"詹姆斯");


        System.out.println("-----------------------");
        //测试获取
        String getResult = s1.get(1);
        System.out.println("获取索引1处的结果为："+getResult);
        System.out.println("此时元素个数为："+s1.length());
        //测试删除
        String removeResult = s1.remove(0);
        System.out.println("删除的元素是："+removeResult);
        System.out.println("此时元素个数为："+s1.length());

        s1.insert("艾弗森");
        System.out.println("此时元素个数为："+s1.length());
        //测试清空
        s1.clean();
        System.out.println("清空后的线性表中的元素个数为:"+s1.length());
    }
}

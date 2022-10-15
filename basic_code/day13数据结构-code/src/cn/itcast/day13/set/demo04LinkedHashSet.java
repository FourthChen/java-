package cn.itcast.day13.set;

import java.util.HashSet;
import java.util.LinkedHashSet;

/*
    java.util.LinkedHashSet集合 extends HashSet集合
    LinkedHashSet集合特点:
        底层是一个哈希表(数组+链表/红黑树)+链表:多了一条链表(记录元素的存储顺序),保证元素有序
 */
public class demo04LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("abc");
        set.add("abc");
        set.add("www");
        set.add("111");
        System.out.println(set); //无序，不重复

        LinkedHashSet<String> set1=new LinkedHashSet<>();
        set1.add("abc");
        set1.add("abc");
        set1.add("www");
        set1.add("111");
        System.out.println(set1); //有序，不重复
    }
}

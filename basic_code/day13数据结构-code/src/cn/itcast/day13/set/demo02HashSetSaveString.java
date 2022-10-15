package cn.itcast.day13.set;

import java.util.HashSet;

//set集合不允许重复元素的原理
public class demo02HashSetSaveString {
    public static void main(String[] args) {
        //创建Hashset的对象
        HashSet<String> set=new HashSet<>();
        String s1=new String("abc");
        String s2=new String("abc");

        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);
    }


}

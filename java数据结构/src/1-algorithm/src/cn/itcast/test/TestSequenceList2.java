package cn.itcast.test;

import cn.itcast.linear.SequenceList;

public class TestSequenceList2 {
    public static void main(String[] args) {
        SequenceList<String> s1 = new SequenceList<String>(3);
        s1.insert("张三");
        s1.insert("李四");
        s1.insert("王五");

        s1.insert("赵六");
    }
}

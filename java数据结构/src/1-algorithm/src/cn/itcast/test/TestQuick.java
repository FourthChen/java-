package cn.itcast.test;

import cn.itcast.sort.Quick;

import java.util.Arrays;

public class TestQuick {
    public static void main(String[] args) {
        Integer[] a={12,31423,423,42,23,4,1,6,8,2432,125,464,342,32,3423,4235,24,534656,0,3456345};
        Quick.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

package cn.itcast.test;


import cn.itcast.sort.Selection;

import java.util.Arrays;

public class TestSelection {
    public static void main(String[] args) {
        Integer[] a={4,5,6,3,2,1};

        Selection.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

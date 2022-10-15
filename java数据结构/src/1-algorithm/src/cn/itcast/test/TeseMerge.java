package cn.itcast.test;

import cn.itcast.sort.Merge;

import java.util.Arrays;

public class TeseMerge {
    public static void main(String[] args) {
        Integer[] a={2,31,4,5,2,15,12,424};
        Merge.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

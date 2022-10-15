package cn.itcast.test;


import cn.itcast.sort.Shell;

import java.util.Arrays;

public class TestShell {
    public static void main(String[] args) {
        Integer[] a={4,5,6,3,231,3,11,22,5,74,32,2,1};

        Shell.sort(a);
        System.out.println(Arrays.toString(a));
    }
}

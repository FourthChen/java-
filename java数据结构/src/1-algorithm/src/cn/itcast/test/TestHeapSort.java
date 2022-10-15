package cn.itcast.test;

import cn.itcast.heap.HeapSort;

import java.util.Arrays;

public class TestHeapSort {
    public static void main(String[] args) throws Exception {
        //待排序数组
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        //通过堆排序对数组元素进行排序
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}

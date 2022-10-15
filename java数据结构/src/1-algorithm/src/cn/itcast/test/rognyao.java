package cn.itcast.test;

import java.util.*;

public class rognyao{

    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(3);


    }

    public static int[] MergeNewArr(int[] arr,int[] arr1){

        int[] arr2 = new int[arr.length + arr1.length];
        for(int i=0;i<arr.length;i++){
            arr2[i] = arr[i];
        }
        for(int i=0;i<arr1.length;i++){
            arr2[arr.length+i] = arr1[i];
        }
        return arr2;
    }

}
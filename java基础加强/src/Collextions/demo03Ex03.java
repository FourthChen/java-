package Collextions;

import java.util.ArrayList;

//把int数组转成存有相同元素的集合(集合里面的元素是Integer)
public class demo03Ex03 {
    public static void main(String[] args) {
        //定义int数组
        int[] arr={1,2,3,4,5};
        ArrayList<Integer> list=listTest(arr);
        System.out.println(list);
    }
    public static ArrayList<Integer> listTest(int[] arr){
        //定义集合
        ArrayList<Integer> list=new ArrayList<Integer>();
        for (int i:arr) {
            list.add(i);
        }
        return list;
    }
}

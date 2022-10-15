package Collextions;

import java.util.ArrayList;

/*
六、定义一个方法listTest(ArrayList<String> al),
 要求使用isEmpty()判断al里面是否有元素。
 */
public class demo06Ex06 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("3");
        System.out.println(listTest(list));
    }
    public static boolean listTest(ArrayList<String> al){
        if (al.isEmpty()){
            return true;
        }
        return false;
    }
}

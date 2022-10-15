package Collextions;

import java.util.ArrayList;

//把集合(集合里面的元素是Integer)转成存有相同元素的数组，并将结果输出在控制台。
public class demo04Ex04 {
    public static void main(String[] args) {
        //定义集合，添加数据
        ArrayList<Integer> list = new ArrayList<>();
        list.add(200);
        list.add(300);
        list.add(400);

        Object[] boj = list.toArray();
        for (Object o : boj) {
            System.out.println(o);
        }
    }
}

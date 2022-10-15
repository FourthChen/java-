package cn.itcast.day07.demo05;
/*
* 题目：
*   定义4个学生对象，添加到集合，并遍历
*
* */
import java.util.ArrayList;

public class demo02ArrayListStuent {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        student one =new student("洪七公",80);
        student two =new student("欧阳锋",70);
        student three=new student("黄药师",22);
        student four=new student("段执行",60);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            student stu=list.get(i);
            System.out.println("姓名是："+stu.getName()+",年龄是："+stu.getAge());
        }
    }

}

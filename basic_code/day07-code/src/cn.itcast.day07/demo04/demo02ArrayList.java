package cn.itcast.day07.demo04;

import java.util.ArrayList;

/*
* 数组的长度不可变
*
* 而ArrayList集合的长度可以改变
*
* 对于ArrayList来说，有一个尖括号<E>表示泛型
* 泛型，就是装在集合里的所有元素，全都是统一的类型，
* 注意，泛型只能是引用类型，不能是基本类型
*
* 对于ArrayList来说，直接打印得到的不是地址值，而是内容
* */
public class demo02ArrayList {
    public static void main(String[] args) {
        //创建了一个ArrayList集合，集合的名称是list，里面装的全都是String
        ArrayList <String> list=new ArrayList<>();
        System.out.println(list);

        //想集合中添加数据，需要用到add方法
        list.add("赵丽颖");
        System.out.println(list);
        list.add("迪丽热巴");
        System.out.println(list);
    }
}

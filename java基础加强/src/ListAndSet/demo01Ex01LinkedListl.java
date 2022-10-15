package ListAndSet;

import java.util.LinkedList;

/*
五、根据要求练习LinkedList方法：
（1）基本方法：add, set, get, remove, clear, size等方法；
（2）特有方法：addFirst, addLast, getFirst, getLast,
            removeFirst, removeLast, push, pop, clear等方法。
 */
public class demo01Ex01LinkedListl {
    public static void main(String[] args) {
        //1.创建LinkedList
        LinkedList<String> arr = new LinkedList<>();

        //2.使用add方法添加元素
        arr.add("李二");
        arr.add("陈三");
        arr.add("王五");
        //3.使用add方法在指定索引
        arr.add(1,"张三");
        System.out.println(arr);
        System.out.println("==========");
        //4.使用set方法修改指定位置索引
        arr.set(0,"晨儿");
        System.out.println(arr);
        //5.使用get方法后去指定索引的元素
        System.out.println(arr.get(2));
        //6.使用size方法获取集合大小
        System.out.println(arr.size());
    }
}

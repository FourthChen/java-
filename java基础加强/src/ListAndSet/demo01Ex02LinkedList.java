package ListAndSet;

import java.util.LinkedList;

public class demo01Ex02LinkedList {
    public static void main(String[] args) {
        //1.创建LinkedList
        LinkedList<String> linked = new LinkedList<>();
        //2.使用add方法添加元素
        linked.add("周杰伦");
        linked.add("周星驰");
        linked.add("周华健");
        linked.add("周润发");
        System.out.println(linked);
        System.out.println("-----------------");
        //3.使用addFirst添加元素到集合最前面
        linked.addFirst("周传雄");
        System.out.println(linked);
        System.out.println("-----------------");
        //4.使用addLast添加元素到集合最后面
        linked.addLast("周渝民");
        System.out.println(linked);
        System.out.println("-----------------");
        // 5.使用getFirst获取集合第一个元素
        System.out.println(linked.getFirst());

        // 6.使用getLast获取集合最后一个元素
        System.out.println(linked.getLast());

        // 7.使用removeLast删除集合第一个元素
        String first = linked.removeFirst();
        System.out.println(first);

        // 8.使用removeLast删除集合最后一个元素
        String last = linked.removeLast();
        System.out.println(last);
        System.out.println(linked);
    }
}

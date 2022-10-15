package ListAndSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class demo03LinkedHashSet {
    public static void main(String[] args) {
        // 1.创建LinkedHashSet
        LinkedHashSet<String> lhSet = new LinkedHashSet<String>();

        // 2.使用add方法添加元素到LinkedHashSet
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("王昭君");
        lhSet.add("西施");
        lhSet.add("杨玉环");
        lhSet.add("貂蝉");

        // 3.使用迭代器获取LinkedHashSet中的元素
        Iterator<String> iterator = lhSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        // 4.使用增强for获取LinkedHashSet中的元素
        System.out.println("---------------------");
        for (String string : lhSet) {
            System.out.println(string);
        }
    }
}

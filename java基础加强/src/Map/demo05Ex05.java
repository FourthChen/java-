package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    1.遍历集合，并将序号与对应人名打印。
    2.向该map集合中插入一个编码为5姓名为李晓红的信息
	3.移除该map中的编号为1的信息
	4.将map集合中编号为2的姓名信息修改为"周林"
 */
public class demo05Ex05 {
    public static void main(String[] args) {
        // 1.定义HashMap,编号作为key,姓名作为value
        Map<Integer,String> map = new HashMap<>();

        // 2.使用put方法添加元素
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        //3.使用keySet遍历
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            String s = map.get(integer);
            System.out.println(integer+"--"+s);
        }

        // 4.使用put向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5, "李晓红");

        // 5.使用remove移除该map中的编号为1的信息
        map.remove(1);

        // 6.使用put将map集合中编号为2的姓名信息修改为"周林"
        map.put(2, "周林");
        System.out.println(map);
    }
}

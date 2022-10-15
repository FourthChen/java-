package cn.itcast.day13.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第一种方式:使用Entry对象遍历


    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合中多个key对象取出来,存储到一个Set集合中
        2.遍历Set集合,获取每一个key对象
        3.使用Map集合中的方法get(key)，通过key找到value
 */
public class demo02EntrySet {
    public static void main(String[] args) {
        //创建Map集合对象
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("杨颖",165);
        map.put("林志玲",178);
        //1.使用Map集合中的方法keySet(),把全部的key取出来，存储到一个Set集合中
        Set<String> set = map.keySet();
        //2.遍历set集合，获取map集合中的每一个key
        //使用迭代器
        Iterator<String> it = set.iterator();
        while (it.hasNext()){
            String key = it.next();
            //3.使用Map集合中的方法get(key)，通过key找到value
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
        System.out.println("============");

        //使用增强for
        for (String key:set) {
            Integer value = map.get(key);
            System.out.println(key+"="+value);
        }
    }

}

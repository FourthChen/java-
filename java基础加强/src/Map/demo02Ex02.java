package Map;

import java.util.HashMap;

//使用Map集合的方法完成添加元素，根据键删除，以及根据键获取值操作。
public class demo02Ex02 {
    public static void main(String[] args) {
        //1.创建HashMap
        HashMap<String, String> hm = new HashMap<>();
        //2.使用put添加新元素
        hm.put("黄晓明", "Baby");
        hm.put("邓超", "孙俪");
        hm.put("李晨", "范冰冰");
        hm.put("大黑牛", "范冰冰");
        //3.使用put修改元素
        hm.put("李晨","白百合");
        //4.使用get获取元素
        String s = hm.get("大黑牛");
        System.out.println(s);
        // 5.使用remove删除元素
        String v2 = hm.remove("大黑牛");
        System.out.println(v2);
        // 6.打印集合中的元素
        System.out.println(hm);
    }
}

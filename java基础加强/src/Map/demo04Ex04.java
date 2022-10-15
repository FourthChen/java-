package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class demo04Ex04 {
    public static void main(String[] args) {
        //2.创建HashMap，key是汽车对象，value是汽车价格
        HashMap<Car, Integer> hm = new HashMap<>();
        //3.添加汽车到HashMap中去
        Car c1=new Car("长安奔奔","黄色");
        Car c3 = new Car("奇瑞QQ", "黑色");
        Car c2 = new Car("铃木奥拓", "白色");

        hm.put(c1, 10000);
        hm.put(c2, 20000);
        hm.put(c3, 30000);
        //4.使用KeySet方式遍历Map
        Set<Car> keySet = hm.keySet();
        for (Car key : keySet) {
            //根据key获取value
            Integer value = hm.get(key);
            System.out.println(key.getName()+","+key.getColor()+'-'+value);
        }
        System.out.println("------------------------------");

        //5.使用entrySet方式遍历Map
        Set<Map.Entry<Car, Integer>> entrySet = hm.entrySet();
        for (Map.Entry<Car, Integer> entry : entrySet) {
            Car key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key.getName()+","+key.getColor()+'-'+value);
        }
    }
}

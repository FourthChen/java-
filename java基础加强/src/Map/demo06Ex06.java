package Map;

import java.util.HashMap;

/*
七、有2个数组，第一个数组内容为：[黑龙江省,浙江省,江西省,广东省,福建省]，
第二个数组为：[哈尔滨,杭州,南昌,广州,福州]，
将第一个数组元素作为key，第二个数组元素作为value存储到Map集合中。
如{黑龙江省=哈尔滨, 浙江省=杭州, …}。
 */
public class demo06Ex06 {
    public static void main(String[] args) {
        // 1.定义第一个数组arr1
        String[] arr1 = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        // 2.定义第二个数组arr2
        String[] arr2 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        //创建HashMap，key存放省，value存放市
        HashMap<String, String> hm = new HashMap<>();
        for (int i = 0; i < arr1.length; i++) {
            String key=arr1[i];
            String value=arr2[i];
            hm.put(key,value);
        }
        System.out.println(hm);
    }
}

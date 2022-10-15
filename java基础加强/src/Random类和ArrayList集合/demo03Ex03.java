package Random类和ArrayList集合;

import java.util.List;

/*
 * 集合工具类。
 * 定义findIndex方法，在某集合中，查找某元素，返回第一次出现的索引。
 * 定义replace方法，将某集合中的某元素，全部替换为新元素。
 */
public class demo03Ex03 {
    public static int findIndex(List<Integer> list,int yuansu){
        int index=-1;
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j)==yuansu){
                index=j;
                break;
            }
        }
        return index;
    }

    public static void replace(List<Integer> list,Integer oldValue,Integer newValue){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == oldValue) {
                list.set(i, newValue);
            }
        }
    }
}

package Random类和ArrayList集合;

import java.util.ArrayList;
import java.util.Random;

/*
 * 统计数字出现次数。

 * 定义getNumList方法，随机生成100个数字，数字范围从1到10。
 * 定义printCount方法，统计每个数字出现的次数并打印到控制台。
 */
public class demo04Ex04 {

    public static void main(String[] args) {
        ArrayList<Integer> numList = getNumList();
        printCount(numList);
    }
    public static ArrayList<Integer> getNumList(){
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int nextInt = random.nextInt(10)+1;
            list.add(nextInt);
        }
        return list;
    }

    public static void printCount(ArrayList<Integer> list){
        int[] count=new int[10];
        for (int i = 0; i < list.size(); i++) {
            int c = list.get(i);
            count[c-1]++;
        }
        for (int i = 0; i < count.length; i++) {
            System.out.println("数字:"+(i+1)+"出现了"+count[i]+"次！");
        }
    }
}

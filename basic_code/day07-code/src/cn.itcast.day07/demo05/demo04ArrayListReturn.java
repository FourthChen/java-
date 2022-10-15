package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

//定义获取所有偶数元素集合的方法(ArrayList类型作为返回值)
public class demo04ArrayListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> Biglist=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 20; i++) {
            int num=r.nextInt(100)+1;
            Biglist.add(num);
        }
        ArrayList<Integer> smallList=getSamllList(Biglist);
        System.out.println("偶数一共有多少个:"+smallList.size());
        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }

    public static ArrayList<Integer> getSamllList(ArrayList<Integer> biglist){
        ArrayList<Integer> SmallList=new ArrayList<>();
        for (int i = 0; i < biglist.size(); i++) {
            int num=biglist.get(i);
            if (num%2==0){
                SmallList.add(num);
            }
        }
        return SmallList;
    }
}

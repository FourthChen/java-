package cn.itcast.day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/*
    斗地主综合案例:有序
        1.准备牌
        2.洗牌
        3.发牌
        4.排序
        5.看牌
 */
public class doudizhu {
    public static void main(String[] args) {
        //1.准备牌
        //创建一个Map集合,存储牌的索引和组装好的牌
        HashMap<Integer,String> poker=new HashMap<>();
        //创建一个List集合,存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //定义两个集合,存储花色和牌的序号
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> numbers = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //把大王小王存入到集合中
        //定义一个牌的索引
        int index=0;
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;

        //循环嵌套遍历两个集合，组装52张牌
        for (String number : numbers) {
            for (String color : colors) {
                poker.put(index,color+number);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);

        //2洗牌
        Collections.shuffle(pokerIndex);
        System.out.println(pokerIndex);

        //3发牌
        //定义4个集合,存储玩家牌的索引,和底牌的索引
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> diPai = new ArrayList<>();
        //遍历存储牌索引的List集合,获取每一个牌的索引
        for (int i = 0; i < pokerIndex.size(); i++) {
            Integer in = pokerIndex.get(i);
            //先判断底牌
            if (i>=51){
                diPai.add(in);
            }else if (i%3==0){
                player01.add(in);
            }
            else if (i%3==1){
                player02.add(in);
            }else if (i%3==2){
                player03.add(in);
            }

        }
        //4.排序,使用Collections中的sort方法
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);

        //5.看牌
        lookpoker("刘德华",poker,player01);
        lookpoker("周润发",poker,player02);
        lookpoker("周星驰",poker,player03);
        lookpoker("底牌",poker,diPai);

    }
    /*
        定义一个看牌的方法,提高代码的复用性
        参数:
            String name:玩家名称
            HashMap<Integer,String> poker:存储牌的poker集合
            ArrayList<Integer> list:存储玩家和底牌的List集合
        查表法:
             遍历玩家或者底牌集合,获取牌的索引
             使用牌的索引,去Map集合中,找到对应的牌
     */
    public static void lookpoker(String name,HashMap<Integer,String> poker,ArrayList<Integer> list){
        System.out.print(name+":");

        //遍历玩家和底牌集合
        for (Integer key : list) {
            String s = poker.get(key);
            System.out.print(s+" ");
        }
        System.out.println();//打印完一个玩家的牌就换行
    }
}

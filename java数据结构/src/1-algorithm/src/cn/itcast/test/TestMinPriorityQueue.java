package cn.itcast.test;

import cn.itcast.priority.MinPriorityQueue;
//测试最小优先队列
public class TestMinPriorityQueue {
    public static void main(String[] args) {
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        MinPriorityQueue<String> minpq = new MinPriorityQueue<>(20);
        for (String s : arr) {
            minpq.insert(s);
        }
        System.out.println(minpq.size());
        String del;
        while(!minpq.isEmpty()){
            del = minpq.delMin();
            System.out.print(del+",");
        }

    }
}

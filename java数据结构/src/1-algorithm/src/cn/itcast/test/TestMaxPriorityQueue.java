package cn.itcast.test;

import cn.itcast.priority.MaxPriorityQueue;

//测试最大优先队列
public class TestMaxPriorityQueue {
    public static void main(String[] args) {
        String[] arr = {"A","B","C","D","E","F","G"};
        MaxPriorityQueue<String> maxPriorityQueue = new MaxPriorityQueue<>(20);
        for (String s : arr) {
            maxPriorityQueue.insert(s);
        }

        while (!maxPriorityQueue.isEmpty()){
            String max = maxPriorityQueue.delMax();
            System.out.print(max+",");
        }
    }
}

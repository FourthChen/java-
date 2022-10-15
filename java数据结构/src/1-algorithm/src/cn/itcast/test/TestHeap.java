package cn.itcast.test;

import cn.itcast.heap.Heap;
//堆的测试
public class TestHeap {
    public static void main(String[] args) {
        Heap<String> heap = new Heap<String>(20);
        heap.insert("A");
        heap.insert("B");
        heap.insert("C");
        heap.insert("D");
        heap.insert("E");
        heap.insert("F");
        heap.insert("G");

        //通过循环从堆中删除数据
        String result=null;
        while ((result=heap.delMax())!=null){
            System.out.print(result+",");
        }
    }
}

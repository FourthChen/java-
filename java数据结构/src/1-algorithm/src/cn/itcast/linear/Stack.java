package cn.itcast.linear;

import java.util.Iterator;

//使用链表实现栈
public class Stack<T> {


    //先实现结点类
    private class Node{
        public T item;
        public Node next;
        public Node(T item, Node next) {
            this.item = item;
            this.next = next;
        }
    }
    //记录首结点
    private Node head;
    //栈中元素的个数
    private int N;

    public Stack() {
        this.head = new Node(null,null);
        N=0;
    }
    //判断当前栈中元素个数是否为0
    public boolean isEmpty(){
        return N==0;
    }
    //获取栈中元素的个数
    public int size(){
        return N;
    }
    //把t元素压入栈
    public void push(T t){
        //找到首节点指向的第一个结点
        Node oldFirst = head.next;
        //创建新的结点
        Node newNode = new Node(t, oldFirst);
        //让新节点指向原来的第一个节点
        head.next=newNode;
        //个数加1
        N++;
    }

    //弹出栈顶元素
    public T pop(){
        Node oldNext = head.next;
        if (oldNext==null){
            return null;
        }
        //删除首个元素
        head.next=head.next.next;
        //个数减1
        N--;
        return oldNext.item;
    }


}

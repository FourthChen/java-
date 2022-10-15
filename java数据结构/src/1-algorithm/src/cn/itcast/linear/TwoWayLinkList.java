package cn.itcast.linear;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable{
    //首结点
    private Node head;
    //尾结点
    private Node last;
    //链表的长度
    private int N;

    @Override
    public Iterator iterator() {
        return null;
    }


    //结点类
    private class Node{
        public Node(T item, Node pre, Node next) {
            this.item = item;
            this.pre = pre;
            this.next = next;
        }

        //存储数据
        public T item;
        //指向上一个结点
        public Node pre;
        //指向下一个结点
        public Node next;
    }
    public TwoWayLinkList(){
        this.last=null;
        this.head = new Node(null, null, null);
        this.N=0;
    }
    //清空链表
    public void clear(){

        this.head.next=null;
        this.head.pre=null;
        this.head.item=null;
        this.last=null;
        N=0;
    }
    //获取链表长度
    public int length(){
        return N;
    }
    //判断链表是否为空
    public boolean isEmpty(){
        return N==0;
    }
    //插入元素t
    public void insert(T t){
        //若链表为空
        if (isEmpty()){
            //创建新得结点
            Node newNode = new Node(t, head, null);
            //让新结点成为尾结点
            last=newNode;
            //让头节点指向尾结点
            head.next=last;
        }else {
            Node oldLast=last;
            //若链表不为空
            //创建新得结点
            Node newNode = new Node(t, oldLast, null);
            //让当前的尾节点指向新结点
            oldLast.next=newNode;
            //让新结点成为尾结点
            last=newNode;

        }
        //元素个数+1
        N++;


    }
    //向指定位置i处插入元素t
    public void insert(int i,T t){

        //找到i-1个结点
        Node pre=head;
        for (int index=0;index<i;index++){
            pre=pre.next;
        }
        //找到i个结点
        Node curr=pre.next;

        //创造一个新结点
        Node newNode = new Node(t, pre, curr);
        curr.pre=newNode;
        pre.next=newNode;
        //元素+1
        N++;
    }
    //获取指定位置i处的元素
    public T get(int i){
        Node n = head.next;
        for (int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }
    //找到元素t在链表中第一次出现的位置
    public int indexOf(T t){
        Node n = head.next;
        for (int index=0;n.next!=null;index++){
            n=n.next;
            if (n.item.equals(t)){
                return index;
            }
        }
        return -1;
    }
    //删除位置i处的元素，并返回该元素
    public T remove(int i){
        //先找到i-1结点
        Node pre=head;
        for (int index=0;index<i;index++){
            pre=pre.next;
        }
        //找到第i个结点
        Node curr=pre.next;

        //找到第i+1结点
        Node n=curr.next;
        pre.next=n;
        n.pre=pre;
        //元素个数-1
        N--;
        return curr.item;
    }
    //获取第一个元素
    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }
    //获取最后一个元素
    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }

}

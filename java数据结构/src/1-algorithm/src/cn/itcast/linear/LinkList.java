package cn.itcast.linear;

import java.util.Iterator;

public class LinkList<T>  {
    //记录头结点
    private Node head;
    //记录链表的长度
    private int N;



    //节点类
    private class Node{
        //存储数据
        T item;
        //下一个节点
        Node next;
        public Node(T item,Node next){
            this.item=item;
            this.next=next;
        }
    }
    public LinkList(){
        //初始化头结点
        this.head=new Node(null,null);
        //初始化元素个数
        this.N=0;
    }
    //清空链表
    public void clean(){
        head.next=null;
        this.N=0;
    }
    //获取链表的长度
    public int length(){
        return N;
    }
    //判断 链表是否为空
    public boolean isEmpt(){
        return N==0;
    }
    //向指定位置i处，添加元素t
    public T get(int i){
        //通过循环，从头节点开始往后找，就可以找到对应的元素
        Node n=head.next;
        for (int index=0;index<i;index++){
            n=n.next;
        }
        return n.item;
    }

    //向链表中添加元素t
    public void insert(T t){
        //找到最后一个结点
        Node n=head;
        while (n.next!=null){
            n=n.next;
        }
        //创建新结点，保存元素
        Node newNode=new Node(t,null);
        //让当前最后一个结点指向新结点
        n.next=newNode;
        //元素个数+1
        N++;
    }

    //向指定位置i处，添加元素t
    public void insert(int i,T t){
        //找到第i-1个结点
        Node pre=head;
        for (int index=0;index<=i-1;index++){
            pre=pre.next;
        }
        //找到第i个结点
        Node curr=pre.next;
        //创建新结点,保存元素
        Node newNode1=new Node(t,curr);
        ////让第i-1个结点指向新结点，新结点指向i个结点
        pre.next=newNode1;
        //元素个数+1
        N++;
    }
    //删除并返回线性表中第i个数据元素
    public T remove(int i){
        //找到第i-1个结点
        Node pre=head;
        for (int index=0;index<=i-1;index++){
            pre=pre.next;
        }
        //找到第i个结点
        Node curr=pre.next;
        //找到第i+1个结点
        Node nextNode=curr.next;
        //让第i-1个结点指向第i+1个结点
        pre.next=nextNode;
        //元素个数-1
        N--;
        return curr.item;
    }
    //查找元素t在链表中第一次出现的位置
    public int indexOf(T t){
        //遍历链表
        Node n=head;
        for (int i=0;n.next!=null;i++){
            n=n.next;
            if (n.item.equals(t)){
                return i;
            }
        }
        return -1;
    }

    //用于反转整个链表
    public void reverse(){
        //先判断当前链表是否为空，若为空则结束运行，若不是，则调用重载得reverse方法完成反转
        if (isEmpt()){
            return;
        }
        reverse(head.next);
    }
    //反转指定的结点，并把反转后的结点返回
    public Node reverse(Node curr){
        if (curr.next==null){
            head.next=curr;
            return curr;
        }
        //递归反转当前结点,反转值就是链表反转后，当前结点的上一个结点
        Node pre = reverse(curr.next);
        //让返回的结点的下一个结点变为当前结点；
        pre.next=curr;
        //当前结点的下一个结点变为null
        curr.next=null;
        return curr;
    }

}

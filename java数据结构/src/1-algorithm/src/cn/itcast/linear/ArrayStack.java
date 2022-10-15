package cn.itcast.linear;
//使用数组实现栈
public class ArrayStack {
    private int top = -1;
    private int maxSize;
    private int []stack;

    public ArrayStack(int maxSize){
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull(){
        return top == maxSize - 1;
    }

    public boolean isEmpty(){
        return top == -1;
    }
    //入栈
    public void push(int data){
        if (isFull()){
            System.out.println("this stack is full");
            return;
        }
        stack[++top] = data;
        System.out.println("the "+data+" is push");
    }
    //出栈
    public int pop () {
        if (isEmpty()){
            throw new RuntimeException("this stack is empty");
        }
        int data = stack[top--];
        return data;
    }
}


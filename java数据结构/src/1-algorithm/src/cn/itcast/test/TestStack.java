package cn.itcast.test;

import cn.itcast.linear.Stack;

public class TestStack {
    public static void main(String[] args) {
        //创建栈对象
        Stack<String> stack = new Stack<>();

        //测试压栈
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");


        System.out.println("------------------------------");
        //测试弹栈
        String result = stack.pop();
        System.out.println("弹出的元素是："+result);
        System.out.println("剩余的元素个数："+stack.size());

    }
}

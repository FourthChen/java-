package cn.itcast.test;

import cn.itcast.linear.Queue;
import cn.itcast.tree.BinaryTree;

//二叉树遍历
public class TestBinaryTreeErgodic {
    public static void main(String[] args) throws Exception {
        BinaryTree<String, String> bt = new BinaryTree<>();
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");
        //前序遍历
        Queue<String> queue1 = bt.preErgodic();
        for (String key : queue1) {
            System.out.print(key+"="+bt.get(key)+"-");
        }
        System.out.println();
        //中序遍历
        Queue<String> queue2 = bt.afterErgodic();
        for (String key : queue2) {
            System.out.print(key+"="+bt.get(key)+"-");
        }
        System.out.println();
        //后序遍历
        Queue<String> queue3 = bt.afterErgodic();
        for (String key : queue3) {
            System.out.print(key+"="+bt.get(key)+"-");
        }
        System.out.println();
        //层序遍历
        Queue<String> queue4 = bt.layerErgodic();
        for (String key : queue4) {
            System.out.print(key+"="+bt.get(key)+"-");
        }
    }
}

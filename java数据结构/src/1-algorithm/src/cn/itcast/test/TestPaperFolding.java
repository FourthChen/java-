package cn.itcast.test;

import cn.itcast.linear.Queue;

//折纸问题
public class TestPaperFolding {
    public static void main(String[] args) {
        //模拟这个过程，产生树
        Node tree = createTree(1);
        //遍历整个树，打印每个结点
        printTree(tree);

    }
    //通过模拟对折N次纸，产生树
    public static Node<String> createTree(int N){
        //定义根结点
        Node<String> root=null;
        for (int i = 0; i < N; i++) {
            //1.当前第一次对折
            if (i==0){
                root=new Node<>("down",null,null);
                continue;//若是第一次对折，则进行第二次循环
            }
            //2、当前不是第一次对折
            //定义一个辅助队列,通过层序遍历的思想，找到叶子结点，叶子结点添加子结点
            Queue<Node> queue = new Queue<>();
            queue.enqueue(root);
            //循环遍历队列
            while (!queue.isEmpty()){
                //从队列中弹出一个结点
                Node tmp = queue.dequeue();
                //如果有左子节点，把左子节点放入队列中
                if (tmp.left!=null){
                    queue.enqueue(tmp.left);
                }
                //如果有右子节点，把右子节点放入队列中
                if (tmp.right!=null){
                    queue.enqueue(tmp.right);
                }
                //如果同时没有左子节点和右子结点，那么证明该节点是叶子结点，只需要给该节点添加左子节点和右子节点
                if (tmp.left==null && tmp.right==null){
                    tmp.left = new Node("down",null,null);
                    tmp.right = new Node("up",null,null);
                }

            }
        }
        return root;

    }
    public static void printTree(Node<String> root){
        //需要使用中序遍历完成
        if (root==null){
            return;
        }
        if (root.left!=null){
            printTree(root.left);
        }
        System.out.print(root.item+",");
        if (root.right!=null){
            printTree(root.right);
        }

    }
    //结点类
    public static class Node<T>{
        public T item;//存储元素
        public Node left;
        public Node right;

        public Node(T item, Node left, Node right) {
            this.item = item;
            this.left = left;
            this.right = right;
        }
    }
}

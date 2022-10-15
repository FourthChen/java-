package cn.itcast.tree;

import cn.itcast.linear.Queue;

public class BinaryTree<Key extends Comparable<Key>,Value> {
    //记录根节点
    private Node root;
    //记录书中元素的个数
    private int N;

    private class Node {
        //存储键
        private Key key;
        //存储值
        private Value value;
        //记录左子节点
        private Node left;
        //记录右子节点
        private Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    //获取树中元素的个数
    public int size() {
        return N;
    }

    //向树中添加元素key-value
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    //向指定的树x中添加key-value,并返回添加元素后新的树
    private Node put(Node x, Key key, Value value) {
        //如果子树x为空
        if (x == null) {
            N++;
            return new Node(key, value, null, null);
        }
        //如果子树x不为空
        //比较x节点的键和key的大小：
        int i = key.compareTo(x.key);
        if (i > 0) {
            //如果key大于x节点的键，则继续找x节点的右子树
            x.right = put(x.right, key, value);
        } else if (i < 0) {
            //如果key小于x节点的键，则继续找x节点的左子树
            x.left = put(x.left, key, value);
        } else {
            //如果key等于x节点的键，则替换x节点的值为value即可
            x.value = value;
        }
        return x;

    }

    //查询树中指定key对应的value
    public Value get(Key key) {
        return get(root, key);
    }

    //从指定的树x中，查找key对应的值
    public Value get(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int i = key.compareTo(x.key);
        if (i > 0) {
            return get(x.right, key);
        } else if (i < 0) {
            return get(x.left, key);
        } else {
            return x.value;
        }
    }

    //删除树中key对应的value
    public void delete(Key key) {
        root = delete(root, key);
    }

    //删除指定树x中的key对应的value，并返回删除后的新树
    public Node delete(Node x, Key key) {
        if (x == null) {
            return null;
        }
        int cmp = key.compareTo(x.key);
        if (cmp > 0) {
            //新结点的key大于当前结点的key，继续找当前结点的右子结点
            x.right = delete(x.right, key);
        } else if (cmp < 0) {
            //新结点的key小于当前结点的key，继续找当前结点的左子结点
            x.left = delete(x.left, key);
        } else {
            //新结点的key等于当前结点的key,当前x就是要删除的结点
            //个数-1
            N--;
            //得找到右子树中最小的节点
            //1.如果当前结点的右子树不存在，则直接返回当前结点的左子结点
            if (x.right == null) {
                return x.left;
            }
            //2.如果当前结点的左子树不存在，则直接返回当前结点的右子结点
            if (x.left==null){
                return x.right;
            }
            //3.当前结点的左右子树都存在
            //3.1找到右子树中最小的结点
            Node minNode=x.right;
            while (minNode.left!=null){
                minNode=minNode.left;
            }
            //3.2删除右子树中最小的结点
            Node n=x.right;
            while (n.left!=null){
                if (n.left.left==null){
                    n.left=null;
                }else {
                    n=n.left;
                }
            }
            //3.3让被删除结点的左子树称为最小结点minNode的左子树，
            minNode.left=x.left;
            // 让被删除结点的右子树称为最小结点minNode的右子树
            minNode.right=x.right;
            //3.4让被删除结点的父节点指向最小结点minNode
            x = minNode;
        }
        return x;
    }
    //找出整个树中最小的键
    public Key min(){
        return min(root).key;
    }
    //找出指定树x中最小的键所在的结点
    private Node min(Node x){
        if (x.left!=null){
            return min(x.left);
        }else{
            return x;
        }
    }
    //找出整个树中最大的键
    public Key max(){
        return max(root).key;
    }
    //找出指定树x中最大键所在的结点
    public Node max(Node x){
        if (x.right!=null){
            return max(x.right);
        }else{
            return x;
        }
    }
    //使用前序遍历，获取整个树中的所有键
    public Queue<Key> preErgodic(){
        Queue<Key> keys = new Queue<>();
        preErgodic(root,keys);
        return keys;
    }
    //使用前序遍历，把指定树x中的所有键放入到keys队列中
    private void preErgodic(Node x,Queue<Key> keys){
        if (x==null){
            return;
        }
        //1.把当前结点的key放入到队列中;
        keys.enqueue(x.key);
        //2.找到当前结点的左子树，如果不为空，递归遍历左子树
        if (x.left!=null){
            preErgodic(x.left,keys);
        }
        //3.找到当前结点的右子树，如果不为空，递归遍历右子树
        if (x.right!=null){
            preErgodic(x.right,keys);
        }
    }
    //使用中序遍历，获取整个树中的所有键
    public Queue<Key> midErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }
    //使用中序遍历，把指定树x中的所有键放入到keys队列中
    private void midErgodic(Node x,Queue<Key> keys){
        if (x==null){
            return;
        }

        //1.找到当前结点的左子树，如果不为空，递归遍历左子树
        if (x.left!=null){
            midErgodic(x.left,keys);
        }
        //2.把当前结点的key放入到队列中;
        keys.enqueue(x.key);
        //3.找到当前结点的右子树，如果不为空，递归遍历右子树
        if (x.right!=null){
            midErgodic(x.right,keys);
        }
    }

    //使用后序遍历，获取整个树中的所有键
    public Queue<Key> afterErgodic(){
        Queue<Key> keys = new Queue<>();
        midErgodic(root,keys);
        return keys;
    }
    //使用后序遍历，把指定树x中的所有键放入到keys队列中
    private void afterErgodic(Node x,Queue<Key> keys){
        if (x==null){
            return;
        }

        //1.找到当前结点的左子树，如果不为空，递归遍历左子树
        if (x.left!=null){
            midErgodic(x.left,keys);
        }

        //2.找到当前结点的右子树，如果不为空，递归遍历右子树
        if (x.right!=null){
            afterErgodic(x.right,keys);
        }
        //3.把当前结点的key放入到队列中;
        keys.enqueue(x.key);
    }
    //使用层序遍历得到树中所有的键
    public Queue<Key> layerErgodic() {
        //定义一个队列，存放树中的键
        Queue<Key> keys = new Queue<>();
        //定义一个队列，存放树中的结点
        Queue<Node> nodes = new Queue<>();
        nodes.enqueue(root);
        while (!nodes.isEmpty()){
            Node n = nodes.dequeue();
            keys.enqueue(n.key);
            if (n.left!=null){
                nodes.enqueue(n.left);
            }
            if (n.right!=null){
                nodes.enqueue(n.right);
            }
        }
        return keys;
    }
    //计算整个树的最大深度
    public int maxDepth() {
        return maxDepth(root);
    }
    //计算指定树x的最大深度
    private int maxDepth(Node x) {
    //1.如果根结点为空，则最大深度为0；
        if (x == null) {
            return 0;
        }
        int max = 0;
        int maxL = 0;
        int maxR = 0;
        //2.计算左子树的最大深度；
        if (x.left != null) {
            maxL = maxDepth(x.left);
        }
        //3.计算右子树的最大深度；
        if (x.right != null) {
            maxR = maxDepth(x.right);
        }
        //4.当前树的最大深度=左子树的最大深度和右子树的最大深度中的较大者+1
        max = maxL > maxR ? maxL + 1 : maxR + 1;
        return max;
    }


}
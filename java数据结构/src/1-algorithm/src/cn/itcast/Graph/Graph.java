package cn.itcast.Graph;


import cn.itcast.linear.Queue;

public class Graph {
    //顶点数目
    private  final  int V;
    //边的数目
    private int E;
    //邻接表
    private Queue<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];

        for (int i = 0; i < adj.length; i++) {
            adj[i]= new Queue<Integer>();
        }
    }
    //获取顶点的数目
    public int V(){
        return  V;
    }
    //获取边的数目
    public int E(){
        return E;
    }
    //向图中添加一条边v-w
    public  void addEdge(int v,int w){
        //在无向图中，边是没有方向的，所以该既可以说是从v到w，也可以说是从w到v
        adj(v).enqueue(w);
        adj(w).enqueue(v);
        //边的数量加1
        E++;
    }
    //获取和顶点v相邻的所有顶点
    public Queue<Integer> adj(int v){

        return  adj[v];
    }
}

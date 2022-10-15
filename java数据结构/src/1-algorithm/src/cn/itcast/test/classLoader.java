package cn.itcast.test;

public class classLoader {
    public classLoader(){
        System.out.println("构造函数");
    }
    {
        System.out.println("代码块");
    }
    static {
        System.out.println("sta");
    }

    public static void main(String[] args) {
        new classLoader();
    }
}

package cn.itcast.day15.demo01GetName;
/*
*   线程名称：
*       主线程：main
*       新线程：Thread-0，Thread-1，Thread-2
*
* */
public class demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread的子类对象
        MyThread mt=new MyThread();
        //调用start方法，开始新线程，执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();


        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
}

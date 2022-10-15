package cn.itcast.day16.demo02ThreadPool;
//2.创建一个类,实现Runnable接口,重写run方法,设置线程任务
public class RunnableIMpl implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建一个新的线程");
    }
}

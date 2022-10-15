package cn.itcast.day16.demo03Lambda;
/*
    使用实现Runnable接口的方式实现多线程程序
 */
public class demo01Runnable {
    public static void main(String[] args) {
        //1.创建Runnable接口的实现类
        RunnableImpl run= new RunnableImpl();

        //2.创建Thread的对象，构造方法种传递Runnable接口的实现类
        Thread t=new Thread(run);
        //3.调用start方法开启新线程，执行run方法
        t.start();


        //简化代码，使用匿名内部类
        Runnable r=new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        };
        new Thread(r).start();

        //继续简化
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"新的线程创建了");
            }
        }).start();
    }
}

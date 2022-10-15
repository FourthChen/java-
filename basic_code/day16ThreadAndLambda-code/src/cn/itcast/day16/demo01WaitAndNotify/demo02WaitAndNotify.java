package cn.itcast.day16.demo01WaitAndNotify;
/*
*   进入TimeWaiting(计时等待)有两种方法
*       1.使用sleep（long m）方法，在毫秒值结束后，线程睡醒进入Runnable/Blocked状态
*       2.使用wait(long m) 方法，wait方法若在毫秒值结束之后，还没有被notify唤醒，就会自动醒来，线程睡醒进入Runnable/Blocked
*   唤醒方法：
*       1.void notify() 唤醒在此对象监视器上等待上的单个线程。
*       2.void notifyAll() 唤醒在此对象监视器上等待上的所有线程。
*
 *   */
public class demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象，保证唯一
        Object obj=new Object();
        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //保证等待和唤醒只有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客1告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入WAITING状态（无限等待）
                        try {
                            obj.wait(5000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子做好了，开吃");
                        System.out.println("====================================");
                    }
                }
            }
        }.start();

        //创建一个顾客线程（消费者）
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //保证等待和唤醒只有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("顾客2告知老板要的包子的种类和数量");
                        //调用wait方法，放弃cpu的执行，进入WAITING状态（无限等待）
                        try {
                            obj.wait(5000);
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                        //唤醒之后执行的代码
                        System.out.println("包子做好了，开吃");
                        System.out.println("====================================");
                    }
                }
            }
        }.start();

        //创建一个老板线程（生产者）
        new Thread(){
            @Override
            public void run() {
                while (true){
                    //花了五秒做包子
                    try {
                        Thread.sleep(5000);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                    //保证等待和唤醒只有一个执行，需要使用同步技术
                    synchronized (obj){
                        System.out.println("老板五秒做好包子了，可以吃了");
                        obj.notifyAll();
                    }
                }
            }
        }.start();
    }
}

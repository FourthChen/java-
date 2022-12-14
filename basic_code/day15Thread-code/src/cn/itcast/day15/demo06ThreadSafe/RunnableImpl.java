package cn.itcast.day15.demo06ThreadSafe;
//实现卖票案例
public class RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket=100;

    //设置线程任务
    @Override
    public void run() {
        //使用死循环，让卖票操作重复进行
        while (true){
            //先判断票是否存在
            if (ticket>0){
                //提高安全问题出现的概率，让程序睡眠
                try {
                    Thread.sleep(100);
                }catch (Exception e){
                    e.printStackTrace();
                }
                //票存在，卖票
                System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                ticket--;
            }
        }
    }
}

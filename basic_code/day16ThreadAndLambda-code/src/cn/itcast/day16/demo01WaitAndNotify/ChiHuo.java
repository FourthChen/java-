package cn.itcast.day16.demo01WaitAndNotify;

public class ChiHuo extends Thread {
    //1.需要在成员位置创建一个包子变量
    private BaoZi bz;
    //2.使用带参数构造方法，为这个包子变量赋值
    public ChiHuo(BaoZi bz) {
        this.bz = bz;
    }
    //设置线程任务：吃包子
    @Override
    public void run() {
        while (true){
            ///必须同时同步技术保证两个线程只能有一个在执行
            synchronized (bz){
                if (bz.flag==false){
                    //没有包子，等待
                    try {
                        bz.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                //被唤醒后执行的代码,吃包子
                System.out.println("吃货正在吃包子"+bz.pi+bz.xian+"包子");
                //吃完包子，修改状态
                bz.flag=false;
                //吃货唤醒包子铺线程，生产包子
                bz.notify();
                System.out.println("吃货已经把"+bz.pi+bz.xian+"包子，吃完了，包子铺开始生产包子");
                System.out.println("==================");
            }
        }
    }
}

package cn.itcast.day16.demo01WaitAndNotify;

public class test {
    public static void main(String[] args) {
        BaoZi bz=new BaoZi();

        new BaoZiPu(bz).start();

        new ChiHuo(bz).start();
    }
}

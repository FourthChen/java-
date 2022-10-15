package cn.itcast.day11.demo08;

import cn.itcast.day11.red.OpenMode;
import cn.itcast.day11.red.RedPacketFrame;

/*
* 说明：
*   红包发出去后，所有人都有红包，大家抢完了后，最后一个红包给群主自己
*
* 自己要做的事情：
*   1.设置程序标题
*   2.设置群主名称
*   3.设置分发策略
*
* 大多数代码都是现成的
* 红包分发的策略：
    1. 普通红包（平均）：totalMoney / totalCount，余数放在最后一个红包当中。
    2. 手气红包（随机）：最少1分钱，最多不超过平均数的2倍。应该越发越少
* */
public class Boostrap {
    public static void main(String[] args) {
        MyRed red=new MyRed("红包发送");
        red.setOwnerName("王思聪");
        //普通红包
        OpenMode normal=new NomalMode();
        red.setOpenWay(normal);

        //手气红包
        OpenMode random=new RandomMode();
        red.setOpenWay(random);
    }
}

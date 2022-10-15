package cn.itcast.day10.demo06;

public class Computer {
    public void powerOn() {
        System.out.println("笔记本 电脑开机");
    }

    public void powerOff() {
        System.out.println("笔记本 电脑关机");
    }

    //使用USB设备的方法,使用接口作为方法的参数
    public void useDevice(USB usb){
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse=(Mouse) usb; //向下转型
            ((Mouse) usb).click();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyBoard=(KeyBoard) usb;
            ((KeyBoard) usb).type();
        }

        usb.close();
    }
}
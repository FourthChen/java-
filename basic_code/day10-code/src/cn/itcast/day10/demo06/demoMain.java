package cn.itcast.day10.demo06;

public class demoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();

        //准备一个鼠标供电脑使用
        //Mouse mouse=new Mouse();
        //首先进行向上转型
        USB usbMouse=new Mouse(); //多态
        computer.useDevice(usbMouse);

        //创建一个键盘
        KeyBoard keyboad=new KeyBoard(); //没有用多态
        //方法参数是USB类型，传递进去的是实现类对象
        computer.useDevice(keyboad);//正确写法，也发生了向上转型

        computer.powerOff();
        System.out.println("==================");

    }
}

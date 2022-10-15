package cn.itcast.day11.demo05;
/*
* 若接口的实现类或者是父类的子类，只需使用唯一的一次
* 这种情况下可以省略掉该类的定义，而改为使用【匿名内部类】
*
* 匿名内部类的定义格式：
*   接口名称 对象名=new 接口名称{
*       覆盖重写所有抽象方法
*   }
*
* du
* */
public class demoMain {
    public static void main(String[] args) {
//        Myinterface impl=new MyclassImpl();
//        impl.method();

        //使用匿名内部类
        Myinterface obj=new Myinterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        obj.method();
    }
}

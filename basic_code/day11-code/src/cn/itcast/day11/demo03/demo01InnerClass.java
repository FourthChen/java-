package cn.itcast.day11.demo03;
/*
* 若一个事物的内部包含另一个事物，这就是一个类包含另一个类
* 例如，人体和心脏的关系，汽车和发动机的关系
*
* 分类：
*   1.成员内部类
*   2.局部内部类（包含匿名内部类）
*
* 成员内部类的定义格式：
*   修饰符 class 类名称{
*       修饰符 class 类名称{
*           ....
*       }
*       ....
*   }
*
* 注意：内用外，随意访问；外用内，需要内部类对象
* ===========================================
* 如何使用成员内部类？
* 1.间接方式：在外部类的方法中，使用内部类；然后main只是调用外部类的方法
* 2.直接方法：
*       公式：外部类名称.内部类名称 对象名=new 外部类名称().内部类名称()
* */
public class demo01InnerClass {
    public static void main(String[] args) {
        Body body=new Body();
        //通过外部类的对象，调用外部类的方法，里面间接在使用内部类的Heart
        body.methodBody();

        Body.Heart heart=new Body().new Heart();
        heart.beat();
    }
}

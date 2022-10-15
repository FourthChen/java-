package cn.itcast.day09.demo01;
/*ding'yi
* 在继承的关系中，”子类就是一个父类“，子类可以被父类看待
*
* 定义父类的格式
*   public class 父类名称{
*       ....
*   }
*
*定义子类的格式：
*   public class 子类名称 extends 父类名称{
*       ....
*   }
* */
public class demo01Extend {
    public static void main(String[] args) {
        //创建了一个子类对象
        Teacher teacher=new Teacher();
        //Teacher类继承了Employee类的方法
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant=new Assistant();
        assistant.method();
    }
}

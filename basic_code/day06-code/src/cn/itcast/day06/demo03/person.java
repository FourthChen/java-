package cn.itcast.day06.demo03;

/*
* 问题描述，定义person的年龄时，无法阻止不合理的数值被设置进来
*
* 解决方法：用private关键词将需要保护的成员变量进行修饰
*
* 一旦使用private进行修饰，那么本类当中也可以随意访问
*
* 但是超出了本类范围就不能直接访问，
*
* 间接访问就是定义一对setAge()/set
*
* */
public class person {
    String name;
    private int age;

    public  void show(){
        System.out.println("我叫"+name+",年龄是"+age);
    }
    //该方法专门用于向age设置数据
    public void setAge(int number){
        if (number<100 && number>0){
            age=number;
        }else {
            System.out.println("数据不合理！");
        }


    }

    //该方法专门用于获取 age的方法
    public int getAge(){
        return age;
    }
}

package cn.itcast.day06.demo04;

//构造方法是专门创建对象的方法，当我们通过关键词new来创建对象时，其实就在调用构造方法
//  格式：
//      public 类名字(){
//         方法体
//      }

//注意事项：
//    1.构造方法的名称和类名称完全一样
//    2.构造方法不要写返回值类型，连void都不写
//    3.构造方法不能return一个具体的返回值
//    4.若没有写任何的构造方法，那么编译器会自动生成一个构造方法
//    5.构造方法也可以重载得
public class student {

    private String name;
    private int age;
    public student(){

        System.out.println("无参构造方法执行了");
    }
    public student(String name,int age){
        this.name=name;

        this.age=age;
        System.out.println("有参构造方法执行了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

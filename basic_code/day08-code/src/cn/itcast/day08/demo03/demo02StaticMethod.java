package cn.itcast.day08.demo03;
// 一旦使用static修饰成员方法，那么这就成为了静态方法。
//静态方法不属于对象，而是属于类

//若没有static关键词，那么必须先创建对象，然后通过对象才能使用它
//有了static关键词，那不需要通过创建对象，直接就能通过类名称来使用它

//注意： 1.静态不能直接方法非静态。（因为先有的静态，后有非静态）
//      2.静态不能用this
public class demo02StaticMethod {
    public static void main(String[] args) {
        myclass obj=new myclass();//首先创建对象
        //然后才能使用没有static关键词的内容

        obj.method();

        //对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称调用
        obj.methodStatic(); //正确，不推荐
        myclass.methodStatic(); //正确，推荐

        //对于本类中的静态方法，可以省略类名称
        myMethod();
    }

    public static void myMethod(){
        System.out.println("自己的方法");
    }
}

package cn.itcast.day21.demo05Consumer;

import java.util.function.Consumer;

/*
        Consumer接口的默认方法andThen
        作用:需要两个Consumer接口,可以把两个Consumer接口组合到一起,在对数据进行消费

        例如:
        Consumer<String> con1
        Consumer<String> con2
        String s = "hello";
        con1.accept(s);
        con2.accept(s);
        连接两个Consumer接口  再进行消费
        con1.andThen(con2).accept(s); 谁写前边谁先消费
        */
public class demo02AndThen {
    //定义一个方法,方法的参数传递一个字符串和两个Consumer接口,Consumer接口的泛型使用字符串
    public static void method(String s,Consumer<String> con1,Consumer<String> con2){
//        con1.accept(s);
//        con2.accept(s);

        //使用AndThen方法
        con1.andThen(con2).accept(s);//con1连接con2,先执行con1消费数据，再执行con2消费数据
    }

    public static void main(String[] args) {
        //调用method方法，传递一个字符串
        method("hello",(t)->{
            //消费方式：变为大写
            System.out.println(t.toUpperCase());
        },(t)->{
            //消费方式：变为小写
            System.out.println(t.toLowerCase());
        });
    }
}

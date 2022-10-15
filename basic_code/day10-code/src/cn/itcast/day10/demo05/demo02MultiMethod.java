package cn.itcast.day10.demo05;
/*
* 在多态的代码中，成员方法的访问规则：
*   看new的是谁，就优先用谁，没有则向上找
*
* 口诀：编译看左边，运行看右边
* */
public class demo02MultiMethod {
    public static void main(String[] args) {
        Fu obj =new Zi(); //多态
        obj.method(); //父子都有，优先用子
        obj.methodFu(); //子类没有，父类有
    }

}

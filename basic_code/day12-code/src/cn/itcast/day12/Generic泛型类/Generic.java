package cn.itcast.day12.Generic泛型类;
/*
* 定义一个含有泛型的类，模拟ArrayList集合
* 泛型是一个未知的数据类型，当我门不确定是什么数据类型时，可以使用泛型
* 泛型可以接受任意的数据类型
* 创建对象时确定泛型的数据类型
* */
public class Generic<E> {
    private E name;

    public Generic(E name) {
        this.name = name;
    }

    public Generic() {
    }

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}

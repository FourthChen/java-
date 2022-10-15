package cn.itcast.day12.Generic泛型类;

public class demo02GenericClass {
    public static void main(String[] args) {
        //不写泛型默认是Object类型
        Generic gc=new Generic();
        gc.setName("只能时字符串");
        Object name = gc.getName();

        //创建Generic对象，泛型使用Integer类型
        Generic<Integer> gc2=new Generic<>();
        gc2.setName(121);
        Integer name1 = gc2.getName();
        System.out.println(name1);

        //创建Generic对象，泛型使用String类型
        Generic<String> gc3=new Generic<>();
        gc3.setName("李华");
        String name2 = gc3.getName();
        System.out.println(name2);

    }
}

package day01_基础加强.reflect;

import day01_基础加强.demain.Person;
import day01_基础加强.demain.Student;

public class reflectdemo01 {
    /*
    *获取Class对象的方式：
            1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
            2. 类名.class：通过类名的属性class获取
            3. 对象.getClass()：getClass()方法在Object类中定义着。
    * */
    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class.forName("全类名")：将字节码文件加载进内存，返回Class对象
        Class<?> cls = Class.forName("day01_基础加强.demain.Person");
        System.out.println(cls);
        //2. 类名.class：通过类名的属性class获取
        Class<Person> cls2 = Person.class;
        System.out.println(cls2);
        //3. 对象.getClass()：getClass()方法在Object类中定义着。
        Person p=new Person();
        Class<? extends Person> cls3 = p.getClass();
        System.out.println(cls3);

        //==比较三个对象
        System.out.println(cls==cls2);//true
        System.out.println(cls2==cls3);//true

        Class<Student> studentClass = Student.class;
        System.out.println(cls==studentClass);
    }
}

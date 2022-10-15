package day01_基础加强.reflect;

import day01_基础加强.demain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class reflectdemo04 {
    /*
     Class对象功能：
     * 获取功能：
         1. 获取成员变量们
         * Field[] getFields() 获取public修饰的成员变量
         * Field getField(String name)

         * Field[] getDeclaredFields()
         * Field getDeclaredField(String name)
     2. 获取构造方法们
         * Constructor<?>[] getConstructors()
         * Constructor<T> getConstructor(类<?>... parameterTypes)

         * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
         * Constructor<?>[] getDeclaredConstructors()
     3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)

     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

     4. 获取类名
     * String getName()

     */
    public static void main(String[] args) throws Exception {
        //0.获取Person的Class的对象
        Class<Person> personClass = Person.class;
        /*
        * 3. 获取成员方法们：
         * Method[] getMethods()
         * Method getMethod(String name, 类<?>... parameterTypes)
        * */
        //获取指定方法名称的方法
        Method eat = personClass.getMethod("eat");
        Person p=new Person();
        //执行方法
        eat.invoke(p);
        System.out.println("------------------");
        Method eat1 = personClass.getMethod("eat", String.class);
        //执行方法
        eat1.invoke(p,"饭");

        System.out.println("------------------");
        //获取所有public修饰的方法
        Method[] methods = personClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
            method.setAccessible(true);//暴力反射
            String name = method.getName();//获取方法名
            System.out.println(name);
        }
        //获取类名
        String Classname = personClass.getName();
        System.out.println(Classname);
    }
}

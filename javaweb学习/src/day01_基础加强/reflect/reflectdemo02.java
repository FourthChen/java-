package day01_基础加强.reflect;

import day01_基础加强.demain.Person;

import java.lang.reflect.Field;

public class reflectdemo02 {
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
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        //0.获取Person的Class的对象
        Class<Person> personClass = Person.class;
        /*
        * * Field[] getFields() 获取public修饰的成员变量
         * Field getField(String name)
         * */
        //1. 获取成员变量们
        Field[] fields = personClass.getFields();
        for (Field field:fields){
            System.out.println(field);
        }
        System.out.println("-------------------");
        Field a = personClass.getField("a");
        //获取成员变量a的值
        Person p=new Person();
        Object o = a.get(p);
        System.out.println(o);
        //设置a的值
        a.set(p,"张三");
        System.out.println(p);
        System.out.println("===================");

        //* Field[] getDeclaredFields()
        Field[] declaredFields = personClass.getDeclaredFields();
        for (Field declareFeilds :declaredFields){
            System.out.println(declareFeilds);
        }
        //* Field getDeclaredField(String name)
        Field c = personClass.getDeclaredField("c");
        //忽略访问控制权限修饰符的安全检擦
        c.setAccessible(true);
        Object o1 = c.get(p);
        System.out.println(o1);

    }
}

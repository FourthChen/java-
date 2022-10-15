package day01_基础加强.reflect;

import day01_基础加强.demain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class reflectdemo03 {
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
         * 2. 获取构造方法们
          * Constructor<?>[] getConstructors()
          * Constructor<T> getConstructor(类<?>... parameterTypes)

          * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
          * Constructor<?>[] getDeclaredConstructors()
         * */

        //* Constructor<?>[] getConstructors()
        Constructor constructors = personClass.getConstructor(String.class, int.class);
        System.out.println(constructors);

        //创建对象
        Object zhangsan = constructors.newInstance("zhangsan", 29);
        System.out.println(zhangsan);
        System.out.println("==========================");
        Constructor constructors1 = personClass.getConstructor();
        System.out.println(constructors1);

        //创建对象
        Object zhangsan1 = constructors1.newInstance();
        System.out.println(zhangsan1);
    }
}

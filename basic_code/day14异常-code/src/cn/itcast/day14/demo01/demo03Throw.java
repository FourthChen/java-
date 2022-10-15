package cn.itcast.day14.demo01;
/*
    throw关键字
    作用:
        可以使用throw关键字在指定的方法中抛出指定的异常
    使用格式:
        throw new xxxException("异常产生的原因");
    注意:
        1.throw关键字必须写在方法的内部
        2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
        3.throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
            throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象,我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
            throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常,要么throws,要么try...catch
 */
public class demo03Throw {
    public static void main(String[] args) {
        int[] arr=new int[3];
        int element = getElement(arr,-1);
        System.out.println(element);
    }
    /*
        定义一个方法,获取数组指定索引处的元素
        参数:
            int[] arr
            int index
        以后，我们首先必须对方法传递过来的参数进行合法性校验

        NullPointerException是运行期异常，我们不用处理，交给JVM处理
     */
    public static int getElement(int[] arr,int index){
        //我们可以对传递过来的参数数组，进行合法性校验
        //如果数组arr的值是null
        //那么我们就抛出空指针异常，告知方法的调用者异常

        if (arr==null){
            throw new NullPointerException("传递的数组为空");
        }
        if (index<0|index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的数组索引越界了");
        }
        int ele = arr[index];
        return ele;
    }
}

package cn.itcast.day21.demo03LambdaTest;
/*
    如果一个方法的返回值类型是一个函数式接口，那么就可以直接返回一个Lambda表达式。
    当需要通过一个方法来获取一个java.util.Comparator接口类型的对象作为排序器时,就可以调该方法获取。
 */
public class demo02Comparator {
    //定义一个方法，方法的返回值类型是一个函数式接口,那么就可以直接返回一个Lambda表达式
//    public static Comparable<String> getComparator(){
//        //方法的返回值类型是一个接口,那么我们可以返回这个接口的匿名内部类
////        return new Comparable<String>() {
////            @Override
////            public int compareTo(String o1,String o2) {
////                //按照字符串的降序排序
////                return o2.length()-o1.length();
////            }
////        };
//        //方法的返回值类型是一个函数式接口,那么我们可以返回一个Lambda表达式
////        return (String o1,String o2)->{
////            return o2.length()-o1.length();
////        };
//    }
}

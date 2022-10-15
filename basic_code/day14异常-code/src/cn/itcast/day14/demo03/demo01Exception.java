package cn.itcast.day14.demo03;

import java.util.List;

public class demo01Exception {
    public static void main(String[] args) {
        /*
            多个异常使用捕获又该如何处理呢？
            1. 多个异常分别处理。
            2. 多个异常一次捕获，多次处理。
            3. 多个异常一次捕获一次处理。
         */
//        int[] arr={1,2,3};
//        System.out.println(arr[3]);
//        System.out.println("============");
//        List<Integer> integers = List.of(1, 2, 3);
//        System.out.println(integers.get(3));


        //1.多个异常分别处理
//        try {
//            int[] arr={1,2,3};
//            System.out.println(arr[3]);
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
//        try {
//            List<Integer> integers = List.of(1, 2, 3);
//            System.out.println(integers.get(3));
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }

        //多个异常一次捕捉，多次处理
//        try {
//            int[] arr={1,2,3};
//           // System.out.println(arr[3]);
//            List<Integer> integers = List.of(1, 2, 3);
//            System.out.println(integers.get(3));
//        }catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }catch (IndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        /*
            一个try多个catch注意事项:
                catch里边定义的异常变量,如果有子父类关系,那么子类的异常变量必须写在上边,否则就会报错
                ArrayIndexOutOfBoundsException extends IndexOutOfBoundsException
         */

        //3. 多个异常一次捕获一次处理。
        try {
            int[] arr={1,2,3};
             System.out.println(arr[3]);
            List<Integer> integers = List.of(1, 2, 3);
            System.out.println(integers.get(3));
        }catch (Exception e){
            System.out.println(e);
        }
        System.out.println("后续代码");
    }
}

package cn.itcast.day08.demo02;
/*
* 分割字符串：
*   public String[] split(String regex); 按照参数规则，将字符串进行切分
*
*   注意事项：
*       split方法的参数是一个正则表达式
*
*       若要按照英文“.”进行切分，必须写“\\.”
* */
public class demo05StringSplit {
    public static void main(String[] args) {
        String str="aaa,demo02SetName,ccc";
        String [] array=str.split(",");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("==========");
        String str2="aaa demo02SetName ccc";
        String [] array2=str2.split(" ");
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        System.out.println("=================");
    }
}

package cn.itcast.day08.demo02;
/*
* String 中与获取相关的常用方法有：
*   public int length（） 拿到字符串长度
*   public String cancat(String str)  //拼接字符串，返回新的字符串
*   public char chat(int index)  获取指定位置的单个字符
*   public int indexOf(String str)  查找参数字符串在本字符串当中首次出现的索引位置，若没有返回-1值
* */
public class demo02SrtingGet {
    public static void main(String[] args) {
        //获取长度
        String str1="length";
        System.out.println("字符串的长度是："+str1.length());

        //拼接字符串
        String str2="hello";
        String str3="world";
        String str4=str2.concat(str3);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("===============");
        //获取指定索引位置的单个字符
        char ch="hello".charAt(1);
        System.out.println("在1号索引位置的字符是："+ch);

        System.out.println("================");

        //查找参数字符串在本字符串当中出现的第一次索引位置
        //若没有，则返回-1值
        String original="helloWord";
        int index=original.indexOf("llo");
        System.out.println("第一次索引值是："+index);
    }
}

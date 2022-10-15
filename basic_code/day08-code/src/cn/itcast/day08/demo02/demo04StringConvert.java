package cn.itcast.day08.demo02;
/*
* String当中与转换相关的常用方法有：
*   public char[] toCharArryay();将当前字符串拆分成为字符数组作为返回值。
*   public byte[] getBytes(); 获得当前字符串底层的字节数组
*   public String replace(CharSequence oldString,CharSequence newString);
*       将所有老字符串替换成为新的字符串，返回替换之后的结果新字符串
*       备注：CharSequence可以接受字符串类型
* */
public class demo04StringConvert {
    public static void main(String[] args) {
        String str="helloWorld";
        char[] chars=str.toCharArray();
        System.out.println(chars[0]);
        System.out.println(chars.length);
        System.out.println("==================");

        //转换为字节数组
        byte[] bytes="abc".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.print(bytes[i]);
        }

        System.out.println("==================");
        String str1=" how do you do?";
        String str2=str1.replace("o","*");
        System.out.println("新的字符串为："+str2);
    }
}

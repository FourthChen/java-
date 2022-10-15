package cn.itcast.day08.demo02;
/*
* 字符串截取方法：
*   public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串
*   public String substring(int begin,int end)：截取从begin开始，到end结束,
*                                               左闭右开
*
* */
public class demo03Substring {
    public static void main(String[] args) {
        String str1="helloString";
        String str2=str1.substring(5);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println("==============");
        String str3=str1.substring(4,7);
        System.out.println(str3);
    }
}

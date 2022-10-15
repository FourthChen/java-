package cn.itcast.day08.demo02;

//==是对象的地址值比较

//若要对其内容比较，则用以下方法：
//  public boolean equals(Object obj)


//public boolean equalsIgnoreCase(String str);  忽略大小写
public class demo01Equals {
    public static void main(String[] args) {
        String str1="abc";
        String str2="abc";

        char [] charArray={'a','b','c'};
        String str3=new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str3.equals("abc"));
        System.out.println("abc".equals(str1));

        String str4="ABC";
        System.out.println(str4.equals(str1));
        System.out.println("===============");

        System.out.println(str4.equalsIgnoreCase(str1));
    }
}

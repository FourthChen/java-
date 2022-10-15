package Math;

import java.util.Scanner;

/*
反转键盘录入的字符串。
 */
public class demo01Ex01 {
    public static void main(String[] args) {
        System.out.println("请输入字符串：");
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        System.out.println("录入的字符串："+next);
//        String s = reverseStr(next);
        System.out.println("反转的字符串："+reverseStr(next));

    }
    public static String reverseStr(String str){
        String s="";
        char[] chars = str.toCharArray();
        for (int i = chars.length-1; i>=0 ; i--) {
            s+=chars[i];
        }
        return s;
    }
}

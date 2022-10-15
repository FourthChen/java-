package Math;

import java.util.Scanner;

/*
 * 判断回文字符串。
 * 如果一个字符串，从前向后读和从后向前读，都是一个字符串，称为回文串，
 * 比如mom，dad，noon。
 */
public class demo05Ex05 {
    public static void main(String[] args) {
        System.out.println("请输入字符串序列：");
        Scanner sc=new Scanner(System.in);
        String next = sc.next();
        System.out.println("字符串是否为回文字符串："+isP(next));
    }
    public static boolean isP(String str){
        int start=0;
        int end=str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

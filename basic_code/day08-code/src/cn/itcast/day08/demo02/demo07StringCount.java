package cn.itcast.day08.demo02;

import java.util.Scanner;

/*
* 题目：
*       键盘输入一个字符串，并且统计其中的各种字符出现的次数
*       种类有：大写字母，小写字母，数字，其他
* */
public class demo07StringCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String input=sc.next();
        int CountUpper=0;
        int CountLower=0;
        int Countnumber=0;
        int CountOther=0;

        char[] charArray=input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch=charArray[i];
            if ('A'<=ch && ch<='Z'){
                CountUpper++;
            }else if ('a'<=ch && 'z'>=ch){
                CountLower++;
            }else if ('0'<=ch && '9'>=ch){
                Countnumber++;
            }else {
                CountOther++;
            }
        }
        System.out.println("大写字母个数为："+CountUpper);
        System.out.println("小写字母个数为："+CountLower);
        System.out.println("数字个数为："+Countnumber);
        System.out.println("其他字符个数为："+CountOther);
    }
}

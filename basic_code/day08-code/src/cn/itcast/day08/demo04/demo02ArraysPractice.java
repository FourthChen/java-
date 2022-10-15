package cn.itcast.day08.demo04;

import java.util.Arrays;

//使用Arrays的相关API，将一个随机字符串中的所有字符升序排列，并倒序打印
public class demo02ArraysPractice {
    public static void main(String[] args) {
        String str="fsdlkmvsdlvmkflsmfls";
        char [] chars=str.toCharArray();
        Arrays.sort(chars);
        for (int i = chars.length-1; i >=0; i--) {
            System.out.print(chars[i]);
        }
    }
}

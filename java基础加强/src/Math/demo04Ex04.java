package Math;

import java.util.Scanner;

/*
 * 替换某字符串中的某字符串。
 * 键盘录入一个srcStr字符串，再录入一个delStr字符串。
 * 删除该字srcStr符串中的所有delStr字符串。
 */
public class demo04Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1.键盘录入一个源字符串由字符串变量scrStr接收
        System.out.print("请输入源字符串:");
        String srcStr = sc.nextLine();
        // 2.键盘录入一个要删除的字符串由字符串变量delStr接收
        System.out.print("请输入要删除的字符串:");
        String delStr = sc.nextLine();
        // 3.删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
        printCount(srcStr, delStr);
    }
    public static void printCount(String srcStr,String delStr){
        //删除后的结果
        String resultStr = srcStr.replace(delStr, "");
        int count=(srcStr.length()-resultStr.length())/delStr.length();
        System.out.println("源字符串中总包含："+count+" 个"+delStr);
    }
}

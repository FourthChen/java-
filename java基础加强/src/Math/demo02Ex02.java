package Math;

import java.util.Scanner;

/*
 * 键盘录入QQ号码，验证格式的正确性。
 * 必须是5—12位数字。
 * 0不能开头。
 */
public class demo02Ex02 {
    public static void main(String[] args) {
        //1.键盘输入一个qq号码字符串
        Scanner sc = new Scanner(System.in);
        String qq = sc.next();
        //2.调用checkQQ (String qq)方法内实现验证。
        boolean isOK = checkQQ(qq);
        //3.打印验证的结果
        System.out.println("这个QQ号码是否正确:" + isOK);
    }
    public static boolean checkQQ(String qq){
        //1.验证字符串的长度在5-12位之间
        if (qq.length()<5|| qq.length()>12){
            return false;
        }
        //2.验证首个字符不能是字符0，只能是字符‘1’--‘9’
        if (qq.charAt(0)=='0'){
            return false;
        }
        //3.验证字符串中的每个字符都必须是数字字符‘0’-‘9’之间的字符
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if (c<'0'||c>'9'){
                return false;
            }
        }
        return true;
    }
}

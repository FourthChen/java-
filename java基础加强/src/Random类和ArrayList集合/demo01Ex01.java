package Random类和ArrayList集合;

import java.util.Random;

/*
 * 随机验证码。

 * 随机生成十组六位字符组成的验证码。
 * 验证码由大小写字母、数字字符组成。
 */
public class demo01Ex01 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String s = verifyCode();
            System.out.println("随机验证码："+s);
        }
    }
    public static String verifyCode() {
        char[] arr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Random random = new Random();
        String code="";
        for (int i = 0; i < 6; i++) {
            int anInt = random.nextInt(arr.length);
            code+=arr[anInt];
        }
        return code;
    }
}

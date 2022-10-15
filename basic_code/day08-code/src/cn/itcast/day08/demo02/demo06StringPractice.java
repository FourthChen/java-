package cn.itcast.day08.demo02;

/*
* 定义一个方法，把数组（1，2，3）按照指定格式拼接成一个字符串，格式如下：[word1#word2#word3]
* */
public class demo06StringPractice {
    public static void main(String[] args) {
        int [] Array={1,2,3};
        String result=fromArrayToString(Array);
        System.out.println(result);

    }
    public static String fromArrayToString(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1){
                str+="word"+array[i]+"]";
            }else {
                str+="word"+array[i]+"#";
            }

        }
        return str;
    }
}

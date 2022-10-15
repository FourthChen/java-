package cn.itcast.day18.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    字符输出流写数据的其他方法
        - void write(char[] cbuf)写入字符数组。
        - abstract  void write(char[] cbuf, int off, int len)写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
        - void write(String str)写入字符串。
        - void write(String str, int off, int len) 写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
 */
public class demo03Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("d.txt");
        char[] chars={'a','b','c','d'};
//        fw.write(chars);
//        fw.flush();
//        fw.close();
        fw.write(chars,1,3);

        fw.write("传智播客");
        fw.flush();
        fw.close();
    }
}

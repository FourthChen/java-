package cn.itcast.day17.demo02递归;

import java.io.File;

/*
    练习:
        递归打印多级目录
    需求:
        遍历c:\\abc文件夹,及abc文件夹的子文件夹
        c:\\abc
        c:\\abc\\abc.txt
        c:\\abc\\abc.java
        c:\\abc\\a
        c:\\abc\\a\\a.jpg
        c:\\abc\\a\\a.java
        c:\\abc\\b
        c:\\abc\\b\\b.java
        c:\\abc\\b\\b.txt
 */
public class demo04Recursion {
    public static void main(String[] args) {
        File f1=new File("E:\\java学习\\basic_code");
        getFile(f1);
    }

    public static void getFile(File f) {
        System.out.println(f);
        File[] files = f.listFiles();
        for (File file : files) {
            if (file.isDirectory()){
                getFile(file);
            }else {
                System.out.println(file);
            }
        }

    }
}

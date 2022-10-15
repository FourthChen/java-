package cn.itcast.day17.demo01File;

import java.io.File;

/*
        File类判断功能的方法
        - public boolean exists() ：此File表示的文件或目录是否实际存在。
        - public boolean isDirectory() ：此File表示的是否为目录。
        - public boolean isFile() ：此File表示的是否为文件。
        */
public class demo04File {
    public static void main(String[] args) {
        demo02();
    }
    /*
            public boolean isDirectory() ：此File表示的是否为目录。
                用于判断构造方法中给定的路径是否以文件夹结尾
                    是:true
                    否:false
            public boolean isFile() ：此File表示的是否为文件。
                用于判断构造方法中给定的路径是否以文件结尾
                    是:true
                    否:false
            注意:
                电脑的硬盘中只有文件/文件夹,两个方法是互斥
                这两个方法使用前提,路径必须是存在的,否则都返回false
         */
    private static void demo02() {
        File f1=new File("e:\\1.txt");
        System.out.println(f1.isDirectory());
        System.out.println(f1.isFile());

        File f2=new File("e:\\visio");
        System.out.println(f2.isDirectory());
        System.out.println(f2.isFile());
    }

    /*
            public boolean exists() ：此File表示的文件或目录是否实际存在。
            用于判断构造方法中的路径是否存在
                存在:true
                不存在:false
         */
    private static void demo01() {
        File f1=new File("e:\\1.txt");
        boolean b = f1.exists();
        System.out.println(b);

        File f2=new File("c:\\ccc");
        System.out.println(f2.exists());
    }
}

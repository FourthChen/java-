package cn.itcast.day18.demo05Writer;

import java.io.FileWriter;
import java.io.IOException;

/*
    续写和换行
    续写,追加写:使用两个参数的构造方法
        FileWriter(String fileName, boolean append)
        FileWriter(File file, boolean append)
        参数:
            String fileName,File file:写入数据的目的地
            boolean append:续写开关 true:不会创建新的文件覆盖源文件,可以续写; false:创建新的文件覆盖源文件
     换行:换行符号
        windows:\r\n
        linux:/n
        mac:/r
 */
public class demo04Writer {


    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("e.txt",true);
        for (int i = 0; i < 3; i++) {
            fw.write("hello,world"+i+"\r\n");
        }
        fw.flush();
        fw.close();

    }

}

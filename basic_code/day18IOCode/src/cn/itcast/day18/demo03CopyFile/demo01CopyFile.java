package cn.itcast.day18.demo03CopyFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习:一读一写

    明确:
        数据源: c:\\WiFi_Log.txt
        数据的目的地: d:\\WiFi_Log.txt

    文件复制的步骤:
        1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
        2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
        3.使用字节输入流对象中的方法read读取文件
        4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
        5.释放资源
 */
public class demo01CopyFile {


    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("c:\\\\WiFi_Log.txt");
        FileOutputStream fos=new FileOutputStream("d:\\\\WiFi_Log.txt");

        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        System.out.println("复制成功！");
        fis.close();
        fos.close();
    }
}

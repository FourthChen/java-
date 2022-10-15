package demo03BSTCp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建BS版本TCP服务器

    http://192.168.163.1//:8080/basic_code/day20Net/src/itcast/web/index.html
 */
public class TCPserver {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(8080);
        Socket socket = server.accept();
        InputStream is = socket.getInputStream();
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=is.read())!=-1){
            System.out.println(new String(bytes,0,len));
        }
    }
}

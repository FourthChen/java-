package basic_code.day18IOCode.src.cn.itcast.day18.demo06TryCatch;

import java.io.FileWriter;
import java.io.IOException;

public class demo01TryCatch {
    public static void main(String[] args) {
        //提高变量fw的作用域
        FileWriter fw=null;
        try {
            //可能出现异常的代码
            fw=new FileWriter("e.txt",true);
            for (int i = 0; i < 3; i++) {
                fw.write("hello,world"+i+"\r\n");
            }

        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

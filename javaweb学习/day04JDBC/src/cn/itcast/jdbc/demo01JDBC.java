package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
快速入门
 */
public class demo01JDBC {
    public static void main(String[] args) throws Exception{
        //1.导入驱动jar包 mysql-connector-java-5.1.37-bin.jar
            //1.复制mysql-connector-java-5.1.37-bin.jar到项目的libs目录下
            // 2.右键-->Add As Library
        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "138304");
        //4.定义一个sql语句
        String sql="update stuinfo set age=19 where stuid=1";
        //5.获取执行sql对象  Statement
        Statement statement = conn.createStatement();
        //6.执行sql
        int count = statement.executeUpdate(sql);
        //7.处理结果
        System.out.println(count);
        //8.释放资源
        statement.close();
        conn.close();
    }
}

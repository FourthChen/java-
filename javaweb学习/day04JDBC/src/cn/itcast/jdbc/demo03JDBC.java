package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
stuinfo 表 修改记录
 */
public class demo03JDBC {
    public static void main(String[] args) {
        Connection conn=null;
        Statement statement=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String sql="update stuinfo set age=19 where stuid=2";
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "138304");
            statement = conn.createStatement();
            int count = statement.executeUpdate(sql);
            if (count>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if (statement!=null){
                try {
                    statement.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            if (conn!=null){
                try {
                    conn.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }
}

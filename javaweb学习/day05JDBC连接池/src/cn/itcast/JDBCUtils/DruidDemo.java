package cn.itcast.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用新的工具类
 */
public class DruidDemo {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pstmt=null;
        //完成添加操作,给user添加一条记录
        //1.获取连接
        try {
            conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql ="insert into user values(null,?,?)";
            //3.获取PreparedStatement对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,"chen");
            pstmt.setString(2,"345");

            //4.执行sql
            int i = pstmt.executeUpdate();

            System.out.println(i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCUtils.close(pstmt,conn);
        }
    }
}

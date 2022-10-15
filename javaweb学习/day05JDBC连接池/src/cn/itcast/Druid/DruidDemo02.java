package cn.itcast.Druid;

import cn.itcast.JDBCUtils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
使用新的工具类
 */
public class DruidDemo02 {
    public static void main(String[] args) {
        //1.获取连接
        try {
            Connection conn = JDBCUtils.getConnection();
            //2.定义sql
            String sql ="insert into user values(null,?,?)";
            //3.获取pstmt对象
            PreparedStatement pstmt = conn.prepareStatement(sql);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}

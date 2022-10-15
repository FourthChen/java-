package cn.itcast.jdbc;

import cn.itcast.util.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
事务操作
 */
public class demo07JDBC {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement preparedStatement1=null;
        PreparedStatement preparedStatement2=null;
        try {
            //1.获取连接
            conn = JDBCutils.getConnection();
            //开启事务
            conn.setAutoCommit(false);
            //2.定义sql
            String sql1="update salarygrade set losalary=losalary-? where grade=? ";
            String sql2="update salarygrade set losalary=losalary+? where grade=? ";
            //3.获取执行sql的对象
            preparedStatement1 = conn.prepareStatement(sql1);
            preparedStatement2 = conn.prepareStatement(sql2);
            //4.设置参数
            preparedStatement1.setInt(1,500);
            preparedStatement1.setInt(2,1);

            preparedStatement2.setInt(1,500);
            preparedStatement2.setInt(2,2);
            //5.执行sql
            preparedStatement1.executeUpdate();
            //手动制造异常
            int i=3/0;
            preparedStatement2.executeUpdate();
            //提交事务
            conn.commit();
        } catch (SQLException throwables) {
            //事务回滚
            try {
                if (conn!=null){
                    conn.rollback();
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally {
            JDBCutils.close(preparedStatement1,conn);
            JDBCutils.close(preparedStatement2,null);
        }
    }
}

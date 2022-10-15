package cn.itcast.jdbc;

import java.sql.*;

/*
stuinfo表 添加一条记录
 */
public class demo02JDBC {
    public static void main(String[] args) {
        Statement statement=null;
        Connection conn=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql="insert into stuinfo values(2,'王一','男','',13,3)";
            //3.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "138304");
            //4.获取执行sql的对象 Statement
            statement = conn.createStatement();
            //5.执行sql
            int count = statement.executeUpdate(sql);//影响的行数
            //6.处理结果
            System.out.println(count);
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
            //7.释放资源
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

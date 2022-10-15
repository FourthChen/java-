package cn.itcast.jdbc;

import java.sql.*;

/*
ResultSet
 */
public class demo04JDBC {
    public static void main(String[] args) {
        Statement statement=null;
        Connection conn=null;
        ResultSet resultSet=null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.定义sql
            String sql="select * from stuinfo";
            //3.获取Connection对象
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "138304");
            //4.获取执行sql的对象 Statement
            statement = conn.createStatement();
            //5.执行sql
            resultSet = statement.executeQuery(sql);//影响的行数
            //6.处理结果
            //6.1让游标向下移动一行
            while (resultSet.next()){
                int stuid = resultSet.getInt("stuid");
                String stuname = resultSet.getString("stuname");
                String stugender = resultSet.getString("stugender");
                System.out.println(stuid+"----"+stuname+"-----"+stugender);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            //7.释放资源
            if (resultSet!=null){
                try {
                    resultSet.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
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

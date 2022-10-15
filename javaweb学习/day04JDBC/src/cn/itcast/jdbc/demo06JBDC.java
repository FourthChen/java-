package cn.itcast.jdbc;

import cn.itcast.util.JDBCutils;

import java.sql.*;
import java.util.Scanner;

/*
* 练习：
		* 需求：
			1. 通过键盘录入用户名和密码
			2. 判断用户是否登录成功
 */
public class demo06JBDC {
    public static void main(String[] args) {
        //1.键盘录入，接受用户名和密码
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password=sc.nextLine();
        //2.调用方法
        boolean flag = new demo06JBDC().login2(username, password);

        //3.判断结果，输出不同语句
        if (flag){
            //登录成功
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }

    /**
     * 使用preparedStatement
     * @param username
     * @param password
     * @return
     */
    public boolean login2(String username,String password){
        if (username==null || password==null){
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet resultSet=null;
        //1.获取连接
        try {
            conn = JDBCutils.getConnection();
            //2.定义sql
            String sql="select * from user where username= ? and password= ?";
            //3.获取执行sql的对象
            pstmt = conn.prepareStatement(sql);
            //给？赋值
            pstmt.setString(1,username);
            pstmt.setString(2,password);
            //4.执行查询,不需要传递sql
            resultSet = pstmt.executeQuery();
            //5.判断
            return resultSet.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCutils.close(resultSet,pstmt,conn);
        }

        return false;
    }
    /**
     * 登录方法
     * @param username
     * @param password
     * @return
     */
    public boolean login(String username,String password){
        if (username==null || password==null){
            return false;
        }
        //连接数据库判断是否登录成功
        Connection conn=null;
        Statement stmt=null;
        ResultSet resultSet=null;
        //1.获取连接
        try {
            conn = JDBCutils.getConnection();
            //2.定义sql
            String sql="select * from user where username='"+username+"' and password='"+password+"'";
            //3.获取执行sql的对象
            stmt = conn.createStatement();
            //4.执行查询
            resultSet = stmt.executeQuery(sql);
            //5.判断
            return resultSet.next();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            JDBCutils.close(resultSet,stmt,conn);
        }

        return false;
    }
}

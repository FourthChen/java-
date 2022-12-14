package cn.itcast.jdbc;

import cn.itcast.demain.Emp;
import cn.itcast.util.JDBCutils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
* 定义一个方法，查询emp表的数据将其封装为对象，然后装载集合，返回。

 */
public class demo05JDBC {
    public static void main(String[] args) {
        List<Emp> findall = new demo05JDBC().findall2();
        System.out.println(findall);
        System.out.println(findall.size());
    }
    /*
    查询所有emp对象

     */
    public List<Emp> findall(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2.获取连接
            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "138304");
            //3.定义sql
            String sql="select * from emp";
            //4.获取执行sql的对象
            Statement statement = conn.createStatement();
            //5.执行sql
            rs = statement.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                // 创建emp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }finally {
            if(rs != null){
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(stmt != null){
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return list;
    }
    /*
    测试JDBCutils方法

     */
    public List<Emp> findall2(){
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<Emp> list = null;
        try {
//            //1.注册驱动
//            Class.forName("com.mysql.jdbc.Driver");
//            //2.获取连接
//            conn = DriverManager.getConnection("jdbc:mysql:///test", "root", "138304");
            conn=JDBCutils.getConnection();
            //3.定义sql
            String sql="select * from emp";
            //4.获取执行sql的对象
            stmt= conn.createStatement();
            //5.执行sql
            rs = stmt.executeQuery(sql);
            //6.遍历结果集，封装对象，装载集合
            Emp emp = null;
            list = new ArrayList<Emp>();
            while (rs.next()){
                //获取数据
                int id = rs.getInt("id");
                String ename = rs.getString("ename");
                int job_id = rs.getInt("job_id");
                int mgr = rs.getInt("mgr");
                Date joindate = rs.getDate("joindate");
                double salary = rs.getDouble("salary");
                double bonus = rs.getDouble("bonus");
                int dept_id = rs.getInt("dept_id");
                // 创建emp对象,并赋值
                emp = new Emp();
                emp.setId(id);
                emp.setEname(ename);
                emp.setJob_id(job_id);
                emp.setMgr(mgr);
                emp.setJoindate(joindate);
                emp.setSalary(salary);
                emp.setBonus(bonus);
                emp.setDept_id(dept_id);

                //装载集合
                list.add(emp);
            }
        }  catch (SQLException throwables) {
            throwables.printStackTrace();
        }
//        finally {
//            if(rs != null){
//                try {
//                    rs.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if(stmt != null){
//                try {
//                    stmt.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            if(conn != null){
//                try {
//                    conn.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
        JDBCutils.close(rs,stmt,conn);
        return list;
    }
}

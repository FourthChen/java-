package cn.itcast.dataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

//c3p0演示
public class C3P0Demo02 {
    public static void main(String[] args) throws SQLException {
        ComboPooledDataSource ds = new ComboPooledDataSource();

        for (int i = 0; i < 11; i++) {
            Connection conn = ds.getConnection();
            System.out.println(i+"："+conn);

            if (i==5){
                conn.close();//归还连接到连接池种
            }
        }
    }
}

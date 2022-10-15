package cn.itcast.JDBCTemplate;

import cn.itcast.JDBCUtils.JDBCUtils;
import org.springframework.jdbc.core.JdbcTemplate;

/*
JDBCTemplate 入门学习
 */
public class JDBCTemplateDemo01 {
    public static void main(String[] args) {
        //1.导入jar包
        //2.创建JDBCTemplate对象
        JdbcTemplate template = new JdbcTemplate(JDBCUtils.getDataSource());
        //3.调用方法
        String sql ="update user set password=456 where id =? ";
        int count = template.update(sql, 2);
        System.out.println(count);

    }
}

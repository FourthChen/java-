package com.itheima.test;

import com.itheima.domain.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class jdbcTemplateCRUDTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    //聚合查询示例
    public void testQueryCount(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account", Long.class);
        System.out.println(count);
    }
    @Test
    public void testQueryOne(){
        Account account = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<Account>(Account.class), "lisi");
        System.out.println(account);
    }
    @Test
    //查询全部示例
    public void testQueryAll(){
        List<Account> queryList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<Account>(Account.class));
        System.out.println(queryList);
    }
    @Test
    //插入示例
    public void testUpdate(){
        int tom = jdbcTemplate.update("update account set money=? where name=?", 1000, "tom");
        System.out.println(tom);
    }
    @Test
    //删除示例
    public void testDelete(){
        int tom = jdbcTemplate.update("delete from account  where name=?",  "tom");
        System.out.println(tom);
    }
}

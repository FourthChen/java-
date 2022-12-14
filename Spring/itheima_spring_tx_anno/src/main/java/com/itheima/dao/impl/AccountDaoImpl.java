package com.itheima.dao.impl;

import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//<bean id="accountDao" class="com.itheima.dao.impl.AccountDaoImpl">
//<property name="jdbcTemplate" ref="jdbcTemplate"/>
//</bean>
@Repository("accoutDao")
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void out(String outMan, double money) {
        jdbcTemplate.update("update account set money=money-? where name=?",money,outMan);
    }

    public void in(String inMan, double money) {
        jdbcTemplate.update("update account set money=money+? where name=?",money,inMan);
    }
}

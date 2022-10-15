package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

//<bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl">
//<property name="accountDao" ref="accountDao"/>
//</bean>
@Service("accountService")
public class AccountServiceImpl implements AccountService {
    @Autowired
    private AccountDao accountDao;

//    事务的增强
    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
//    声明式事务控制中的切点
    public void transfer(String outMan, String inMan, double money) {
        //开启事务
        accountDao.out(outMan,money);
//        int i=1/0;
        accountDao.in(inMan,money);
        //提交事务
    }
}

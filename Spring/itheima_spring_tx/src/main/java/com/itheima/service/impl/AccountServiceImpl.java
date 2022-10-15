package com.itheima.service.impl;

import com.itheima.dao.AccountDao;
import com.itheima.service.AccountService;

public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

//    声明式事务控制中的切点
    public void transfer(String outMan, String inMan, double money) {
        //开启事务
        accountDao.out(outMan,money);
//        int i=1/0;
        accountDao.in(inMan,money);
        //提交事务
    }
}

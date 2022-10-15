package com.itheima.dao;

public interface AccountDao {

    //转出钱方法
    public void out(String outMan, double money);
    //转入钱方法
    public void in(String inMan, double money);

}

package com.itheima.test;

import com.itheima.config.SpringConfiguration;
import com.itheima.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//加载spring核心配置类
@RunWith(SpringJUnit4ClassRunner.class)
//加载spring核心配置文件
//@ContextConfiguration("classpath:applicationContext.xml")

@ContextConfiguration(classes = {SpringConfiguration.class})
public class SpringJunitTest {
    @Autowired
    private UserService userService;
    @Autowired
//    private DataSource dataSource;

    @Test
    public void test1() throws Exception{
        userService.save();
//        System.out.println(dataSource.getConnection());
    }
}

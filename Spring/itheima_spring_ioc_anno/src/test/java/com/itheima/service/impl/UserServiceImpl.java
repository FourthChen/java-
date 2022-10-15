package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

//<bean id="userService" class="com.itheima.service.impl.UserServiceImpl">
//@Component("userService")
@Service("userService")//使用在service层类上用于实例化Bean

//@Scope("prototype")//标注Bean的作用范围
@Scope("singleton")
public class UserServiceImpl implements UserService {
//    注入普通属性
    @Value("${jdbc.driver}") //在spring容器中找到，赋值给driver
    private String driver;
//    <property name="userDao" ref="userDao"></property>
    @Autowired//按照数据类型从spring容器中进行匹配
    @Qualifier("userDao")//按照ID值从容器中开始匹配，但是此处@Qualfier结合@Autowired一起使用
//    @Resource(name = "userDao") //@Resource相当于@Qualfier+@Autowired
    private UserDao userDao;

    public void save() {
        System.out.println(driver);
        userDao.save();

    }
//    使用在方法上标注该方法是Bean的初始化方法
    @PostConstruct
    public void init(){
        System.out.println("Service对象的初始化方法");
    }
    @PreDestroy
    public void destory(){
        System.out.println("Service对象的销毁方法");
    }
}

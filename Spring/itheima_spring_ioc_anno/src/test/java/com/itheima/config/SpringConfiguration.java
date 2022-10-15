package com.itheima.config;


import com.alibaba.druid.pool.DruidDataSource;
import javax.sql.DataSource;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.beans.PropertyVetoException;

//标志该类是Spring的核心配置类
@Configuration
//<!--配置组件扫描-->
//<context:component-scan base-package="com.itheima"></context:component-scan>
@ComponentScan("com.itheima")

//<import resource=""/>
@Import({DataSourceConfiguration.class})
public class SpringConfiguration {


}

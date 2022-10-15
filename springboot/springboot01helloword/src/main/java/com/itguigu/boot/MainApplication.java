package com.itguigu.boot;


import ch.qos.logback.core.db.DBHelper;
import com.itguigu.boot.bean.Pet;
import com.itguigu.boot.bean.User;
import com.itguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/*
    主程序类
 */
@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        //1.返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        //2.查看容器里面的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
        //3.从容器获取组件
        Pet tom01 = run.getBean("tom", Pet.class);
        Pet tom02 = run.getBean("tom", Pet.class);
        System.out.println("组件："+(tom01==tom02));

        MyConfig myConfig = run.getBean(MyConfig.class);
        System.out.println(myConfig);

        User user01 = myConfig.user01();
        User user = myConfig.user01();
        System.out.println(user==user01);


        //5.获取组件
        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        System.out.println("===========");
        for (String s : beanNamesForType) {
            System.out.println(s);
        }

        DBHelper bean1 = run.getBean(DBHelper.class);
        System.out.println(bean1);
    }
}

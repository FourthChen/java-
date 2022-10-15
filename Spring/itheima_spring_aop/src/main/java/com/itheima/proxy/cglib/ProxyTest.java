package com.itheima.proxy.cglib;

import com.itheima.proxy.jdk.TargetInterface;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//基于Jdk的代理
public class ProxyTest {
    public static void main(String[] args) {
        //创建目标对象
        final Target target=new Target();

        //创建增强对象
        final Advice advice=new Advice();
        //返回值  就是动态生成的代理对象 基于cglib

        //1.创建增强器
        Enhancer enhancer=new Enhancer();
        //2.设置父类(目标)
        enhancer.setSuperclass(Target.class);
        //3.设置回调
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
               advice.before();//执行前置
                Object invoke = method.invoke(target, args);//执行目标
                advice.after();//执行后置
                return null;
            }
        });
        //4.创建代理对象
        Target proxy =(Target) enhancer.create();


        proxy.save();
    }
}

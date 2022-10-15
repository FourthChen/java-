package day01_基础加强.test;

import day01_基础加强.junit.Calculator;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    /*初始化方法*/
    @BeforeAll
    public void init(){
        System.out.println("init......");
    }
    /*释放资源方法*/
    @AfterAll
    public void close(){
        System.out.println("close......");
    }
    /*
    * 测试add方法
    *
    * */
    @Test
    public void testAdd(){
        System.out.println("我被执行了");
        Calculator c=new Calculator();
        int sub = c.sub(3, 1);
//        System.out.println(sub);

        //断言
        Assertions.assertEquals(2,sub);
    }
}

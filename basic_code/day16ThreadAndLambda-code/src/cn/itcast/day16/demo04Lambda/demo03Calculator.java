package cn.itcast.day16.demo04Lambda;
/*
    Lambda表达式有参数有返回值的练习
    需求:
        给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
        使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
 */
public class demo03Calculator {
    public static void main(String[] args) {
        //调用invokeSum
        invokeSum(12, 13, new Calculator() {
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        });

        //Lambda
        invokeSum(1,3,(int a,int b)->{
            return a+b;
        });

        //Lamdba再简化
        invokeSum(1,2,(a,b)->a+b);
    }

    //定义一个方法 ，参数：两个int类型的参数
    public static void invokeSum(int a,int b,Calculator c){
        int sum=c.sum(a,b);
        System.out.println(sum);
    }
}

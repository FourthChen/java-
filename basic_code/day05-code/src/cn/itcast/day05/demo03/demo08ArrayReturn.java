package cn.itcast.day05.demo03;
//数组可以作为返回值
public class demo08ArrayReturn {
    public static void main(String[] args) {
        int [] result=calculate(10,20,40);
        System.out.println("数组总和是："+result[0]);
        System.out.println("数组平均值为："+result[1]);
    }

    public static int[] calculate(int a,int b,int c){
        int sum=a+b+c;
        int avg=sum/3;
        int [] array=new int[2];

        array[0]=sum;
        array[1]=avg;

        return array;
    }
}

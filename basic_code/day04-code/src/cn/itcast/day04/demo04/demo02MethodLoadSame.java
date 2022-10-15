package cn.itcast.day04.demo04;
//判断不同类型的两个数据是否相同
public class demo02MethodLoadSame {
    public static void main(String[] args) {

    }
    public static boolean isSame(short a,short b){
        System.out.println("这是两个short参数执行！");
        boolean same;
        if (a==b){
            same=true;
        }else {
            same=false;
        }
        return same;
    }
    public static boolean isSame(byte a,byte b){
        System.out.println("这是两个byte参数执行！");
        boolean same=a==b ? true:false;
        return same;
    }
    public static boolean isSame(int a,int b){
        System.out.println("这是两个intshort参数执行！");
        return a==b;
    }
}

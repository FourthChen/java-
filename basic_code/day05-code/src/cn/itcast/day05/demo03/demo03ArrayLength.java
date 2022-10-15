package cn.itcast.day05.demo03;


//数组一旦创建，程序运行期间，长度不可改变
public class demo03ArrayLength {
    public static void main(String[] args) {
        int[] array1=new int[3];

        int[] array2={10,20,30};

        int len=array2.length;
        System.out.println("array2数组的长度为："+len);
    }
}

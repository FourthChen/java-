package cn.itcast.day05.demo03;
//反转一个数组
public class demo06ArrayReverse {
    public static void main(String[] args) {

        int [] array={32,313,355,12,53,0};
        int len=(array.length);

        for (int min = 0, max=len-1; min < max; min++,max--) {
            int tmp=array[0];
            tmp=array[min];
            array[min]=array[max];
            array[max]=tmp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

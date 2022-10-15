package cn.itcast.test;

import java.util.Scanner;

public class Singleton {
    private static final Singleton INSTANCE =new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        return  INSTANCE;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        String str;
        for (int i = 0; i < n; i++) {

            nums[i]=sc.nextInt();

        }
        for (int i = 0; i < n; i++) {

            int res1=0;
            int res2=0;
            int res3=0;
            int res=0;
            for (int i1 = 0; i1 < nums[i]; i1++) {

                str=String.valueOf(nums[i1]);
               if( str.contains("1")){
                   res1++;
               }
                if(str.contains("2")){
                    res2++;
                }
                if(str.contains("3")){
                    res3++;
                }
                res=res1+res2+res3;
                if(res==1){
                    res++;
                }
                res=0;
            }
            System.out.println(res);
        }

    }
}

package cn.itcast.sort;
//希尔排序，是优化版的插入排序
public class Shell {
    public static void sort(Comparable[] a){
        int N=a.length;
        //确定增长量的最大值
        int h=1;
        while (h<N/2){
            h=2*h+1;
        }

//        当增长量小于1时，结束排序
        //希尔排序
        while (h>=1){
            for (int i=h;i<N;i++){
                for (int j=i;j>=h;j-- ){
                    if (greater(a[j],a[j-h])){
                        break;
                    }else {
                        exch(a,j,j-h);
                    }
                }
            }
            h=h/2;
        }
    }
    /**
     * 比较v是否大于w
     * @param v
     * @param w
     * @return
     */
    public static boolean greater(Comparable v, Comparable w){
        int result = v.compareTo(w);
        if (result>=0){
            return true;
        }
        return false;
    }

    /**
     * 交换两个值
     * @param a
     * @param i
     * @param j
     */
    public static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

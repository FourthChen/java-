package cn.itcast.sort;

public class Insertion {
    /**
     * 插入排序
     * @param a
     */
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j=i;j>0;j--){
                if (greater(a[j],a[j-1])){
                    break;
                }else {
                    exch(a,j,j-1);
                }

            }
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

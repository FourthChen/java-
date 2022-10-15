package cn.itcast.sort;
//冒泡排序
public class Bubble {
    /**
     * 对数组a中的元素进行排序
     * @param a
     */
    public static void sort(Comparable[] a){
//        //i控制多少个元素参与冒泡
//        for (int i = a.length-1; i > 0; i--) {
//            for (int j=0;j<i;j++){
//                if (greater(a[j],a[j+1])){
//                    exch(a,j,j+1);
//                }
//            }
//        }

        for (int i=a.length;i>0;i--){
            for (int j=0;j<i;j++){
                if (greater(a[j],a[j+1])){
                    exch(a,j,j+1);
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
    public static void exch(Comparable[] a,int i,int j){
        Comparable t=a[i];
        a[i]=a[j];
        a[j]=t;
    }
}

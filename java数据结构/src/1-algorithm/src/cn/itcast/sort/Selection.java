package cn.itcast.sort;
//选择排序
public class Selection {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length-2; i++) {
            //假设最小值所在的索引为i
            int min_index=i;
            for (int j=i+1;j<a.length;j++){
                if (greater(a[min_index],a[j])){
                    min_index=j;
                }
            }
            exch(a,i,min_index);
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

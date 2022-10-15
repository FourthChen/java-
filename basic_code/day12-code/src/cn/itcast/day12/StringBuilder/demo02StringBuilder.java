package cn.itcast.day12.StringBuilder;
/*
    StringBuilder的常用方法:
        public StringBuilder append(...)：添加任意类型数据的字符串形式，并返回当前对象自身。
 */
public class demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu=new StringBuilder();

//        StringBuilder bu2=bu.append("abc");
//        System.out.println(bu);
//        System.out.println(bu2);
//        System.out.println(bu==bu2);
        bu.append("121sa");
        bu.append(121);
        System.out.println(bu);

        bu.append("abc").append(12).append(9.9);
    }
}

package cn.itcast.day16.demo04Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class demo02Arrays {
    public static void main(String[] args) {
        person[] arr={
                new person("李艳",19),
                new person("王二",18),
                new person("陈四",30)
        };
        //对年龄排序
        Arrays.sort(arr, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        //遍历数组
        for (person s:arr
             ) {
            System.out.println(s);
        }

        //使用Lambda
        Arrays.sort(arr,(person o1,person o2)->{
            return o1.getAge()-o2.getAge();
        });

        //遍历数组
        for (person s:arr
                ) {
            System.out.println(s);
        }

        //继续省略
        Arrays.sort(arr,((o1, o2) -> o1.getAge()-o2.getAge()));
    }
}

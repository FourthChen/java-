package Random类和ArrayList集合;
/*
 * 自定义MyList类，实现存取元素的功能。

 * 定义add方法，可以保存元素，添加MyList尾部。
 * 定义remove方法，可以获取到最后添加的元素，并从MyList中移除该元素。
 * 定义show方法，可以展示MyList中的元素。
 */
import java.util.ArrayList;

public class MyList {
    ArrayList<Integer> m1=new ArrayList<>();

    public  void add(Integer i){
        m1.add(i);
    }
    public Integer remove(){
        Integer remove = m1.remove(m1.size() - 1);
        return remove;
    }
    public void show(){
        System.out.println(m1);
    }
}

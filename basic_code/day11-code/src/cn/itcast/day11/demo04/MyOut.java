package cn.itcast.day11.demo04;

public class MyOut {
    public void methodOuter(){
        int num=10;
        class Inner{
            public void methodInner(){
                System.out.println(num);
            }
        }
    }

}

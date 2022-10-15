package cn.itcast.day10.demo06;

public interface USB {
    public abstract  void open(); //不确定打开什么，所以用抽象方法
    public abstract void  close();
}

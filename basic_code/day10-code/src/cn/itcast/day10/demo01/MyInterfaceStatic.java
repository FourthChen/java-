package cn.itcast.day10.demo01;
/*
* 从java8开始，接口允许定义静方法
* 格式：
*   public static 返回值类型 方法名称(参数列表){
*       方法体
*   }
*
* 提示：就是将abstract或者default 换成static即可，带上方法体
* */
public interface MyInterfaceStatic {
    public static  void methodStatic(){
        System.out.println("这是一个接口的静态方法");
    }
}

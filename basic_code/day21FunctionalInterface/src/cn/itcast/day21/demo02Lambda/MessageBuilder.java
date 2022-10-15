package cn.itcast.day21.demo02Lambda;
@FunctionalInterface
public interface MessageBuilder {
    //定义一个拼接信息的抽象方法
    public abstract String builderMessage();
}

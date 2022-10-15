package cn.itcast.day06.demo03;

public class student {
    private String name;
    private int age;
    private boolean male; //是不是男的

    public void setName(String str){
        name=str;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public boolean isMale() {
        return male;
    }
}

package cn.itcast.day14.demo04多线程;

public class Person {
    private String name;
    private int age;
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+"-->"+i);
        }
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

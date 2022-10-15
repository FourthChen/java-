package day01_基础加强.demain;

public class Person {
    private String name;
    private int age;

    public String a;
    protected  String b;
    private  String c;

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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", a='" + a + '\'' +
                ", b='" + b + '\'' +
                ", c='" + c + '\'' +
                '}';
    }
    public void eat(){
        System.out.println("eat.....");
    }
    public void eat(String food){
        System.out.println("eat....."+food);
    }
}

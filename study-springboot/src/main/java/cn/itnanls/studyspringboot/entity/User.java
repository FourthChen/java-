package cn.itnanls.studyspringboot.entity;

public class User {
    private  String  name="www.itnanls.com";
    private  String cat;

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", cat='" + cat + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

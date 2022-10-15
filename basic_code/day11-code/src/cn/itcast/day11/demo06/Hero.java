package cn.itcast.day11.demo06;
/*
* 游戏中的英雄角色
* */
public class Hero {
    private String name;
    private Weapon weapon;//英雄的武器
    private int age;

    public Hero() {
    }

    public Hero(String name, Weapon weapon, int age) {
        this.name = name;
        this.weapon = weapon;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void attack(){
        System.out.println("年龄为"+age+"的"+name+"用"+weapon.getCode()+"攻击敌方");
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}


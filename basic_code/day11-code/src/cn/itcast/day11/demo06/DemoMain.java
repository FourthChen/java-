package cn.itcast.day11.demo06;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero=new Hero();
        hero.setName("伊利丹");
        hero.setAge(20);

        Weapon weapon=new Weapon("多兰剑");
        hero.setWeapon(weapon);
        hero.attack();
    }
}

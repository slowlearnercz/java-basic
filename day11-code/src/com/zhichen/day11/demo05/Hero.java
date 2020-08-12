package com.zhichen.day11.demo05;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 16:18
 */
public class Hero {
    private String name;
    private Weapon weapon;
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

    public void attack() {
        System.out.println(age + "岁的" + name + "用" + weapon.getNickname() + "攻击敌方");
    }
}

package com.zhichen.day11.demo05;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 16:21
 */
public class HeroDrive {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("德玛西亚之力");
        hero.setAge(20);
        Weapon weapon = new Weapon("大宝剑");
        hero.setWeapon(weapon);
        //注意为英雄配备武器的时候，需要先声明weapon对象，才能赋予
        //不同于String可以直接赋予
        hero.attack();
    }
}

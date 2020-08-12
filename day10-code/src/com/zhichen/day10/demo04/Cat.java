package com.zhichen.day10.demo04;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:31
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}

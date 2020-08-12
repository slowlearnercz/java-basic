package com.zhichen.day10.demo04;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:33
 *
 *
 */
public class Demo01Multi {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.eat();

        System.out.println(animal instanceof Cat);

        Cat cat = (Cat) animal;
        cat.catchMouse();


    }
}

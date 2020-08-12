package com.zhichen.day03.demo05HashSet;

import java.util.HashSet;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 15:04
 *
 * 使用HashSet集合存储自定义类型元素
 *
 * 要求：同名同年龄的人，视为同一个人
 */
public class Demo02HashSetPerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        Person p3 = new Person("张三",19);
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }

}

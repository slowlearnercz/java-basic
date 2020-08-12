package com.zhichen.day1.demo1;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 11:18
 *
 * toString方法
 */
public class demo01 {
    public static void main(String[] args) {
        Person person = new Person("张三",18);
        System.out.println(person.toString());//包地址+地址值
        //直接打印对象的名字，其实就是调用对象的toString方法
        System.out.println(person);
        Random r = new Random();
        System.out.println(r.nextInt(10));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(list.toString());//ArrayList类对toString进行了重写。Scanner类也进行了重写
    }
}

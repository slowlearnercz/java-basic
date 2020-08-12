package com.zhichen.day02.demo04General;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 11:18
 *
 * 创建集合对象，也可以不使用泛型，不指定类型
 * 好处：
 *      不使用泛型，默认类型就是Object类型，可以存储任意类型的数据
 * 坏处：
 *      不安全，会引发异常
 *
 * 使用泛型
 * 好处：1避免类型转换的麻烦，存储的是什么类型，取出的就是什么类型
 * 2把运行期间才能发现的异常，提前到编译期
 * 坏处：泛型是什么类型，就只能存储什么类型的数据
 */
public class Notes {
    public static void main(String[] args) {
        method1();
    }
    public static void method1(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(10);
        for(Object e : list){
            System.out.println(e);
        }
        //如果想使用String类特有的方法，例如length获取字符串长度，不能使用
        //需要先向下转型
        Iterator iterator = list.iterator();
        String s = (String) iterator.next();
        System.out.println(s);
    }
}

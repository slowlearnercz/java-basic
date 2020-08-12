package com.zhichen.day03.demo01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 14:56
 *
 * list接口 extends Collection接口
 * list接口的特点：
 *      1.集合是有序的，存储元素和取出元素的顺序是一致的
 *      2.有索引，包含使用索引的方法
 *      3.允许存储重复元素
 * List接口带索引的方法
 *      public void add(int index, E element) 将指定元素，添加到该集合中的指定位置上
 *      public E get(int index)               返回集合中指定位置的元素
 *      public E remove(int index)            移除指定位置的元素，并将被移除元素返回
 *      public E set(int index, E element)    用指定元素替换指定位置的元素，将被替换的元素返回
 */
public class Demo01List {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();  //不同于day1的代码  day1用的是Collection去声明,当时也没有用带索引的方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);
        //在c，d之间添加一个it黑马
        list.add(3,"it黑马");//注意索引是3不是2，3代表放置于3的位置
        System.out.println(list);
        //移除c
        String removeE = list.remove(2);
        System.out.println(removeE);
        System.out.println(list);
        //set方法使用，把第二个a换成it白马
        String replacedE = list.set(4,"it白马");
        System.out.println(replacedE);
        System.out.println(list);
        //get
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            System.out.println(s);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}

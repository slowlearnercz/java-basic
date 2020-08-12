package com.zhichen.day02.demo05FanXingTongPet;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 9:33
 *
 * 泛型的通配符：？代表任意的数据类型
 * 使用方式：
 *      不能创建对象使用， 只能作为方法的参数使用
 */
public class DemoTongPei {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("aa");
        list2.add("bb");

        printArray(list);
        printArray(list2);

    }
    //定义一个方法，要求遍历所有类型的ArrayList集合，此时我们不确定ArrayList使用何种类型
    public static void printArray(ArrayList<?> list){
        //使用迭代器
        Iterator<?> iterator = list.iterator();
        while(iterator.hasNext()){
            //next方法取出的是Object类型，可以接收任意数据类型
            Object o = iterator.next();
            System.out.println(o);
        }

    }
}

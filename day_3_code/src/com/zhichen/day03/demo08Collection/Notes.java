package com.zhichen.day03.demo08Collection;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 16:55
 *
 *
 * Collections  注意末尾有s，这是集合的常用工具类
 * 常用方法:
 *      public static <T> boolean addAll(Collection<T> c, T...elements)  往集合中添加一些元素
 *      public static void shuffle(List<?> list)  打乱集合元素的顺序
 *
 *      public static <T> void sort(List<T> list)  将集合中元素按照默认规则排序  （默认升序）
 *
 * 自定义类型集合要使用sort方法，必须实现Comparable接口，重写compareTo方法，指定排序规则
 *
 *      还有一种sort方法
 *      public static <T> void sort(List<T> list, Comparator<? super T>) 将集合种元素按照指定规则排序
 *      Comparator相当于传入一个第三方的裁判，作为参数
 */
public class Notes {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        Collections.addAll(list, "a","b","c","d","e");
//        System.out.println(list);
//        Collections.shuffle(list);
//        System.out.println(list);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(10);
        list.add(7);
        System.out.println(list);//[1, 2, 0, 10, 7]
        Collections.sort(list);
        System.out.println(list);//[0, 1, 2, 7, 10]

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("a");
        list2.add("c");
        list2.add("b");
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
    }
}

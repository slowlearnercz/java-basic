package com.zhichen.day03.demo06LinkedHashSet;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 15:20
 */
public class Demo01LinkedHashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("www");
        set.add("abc");
        set.add("abc");
        set.add("it");
        System.out.println(set);//[abc, www, it]  无序

        LinkedHashSet<String> set2 = new LinkedHashSet<>();
        set2.add("www");
        set2.add("abc");
        set2.add("abc");
        set2.add("it");
        System.out.println(set2);//[www, abc, it]  有序
    }
}

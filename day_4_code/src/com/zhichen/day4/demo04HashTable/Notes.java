package com.zhichen.day4.demo04HashTable;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 10:38
 *
 * HashTable底层哈希表，单线程，线程安全的集合，速度慢一些
 * HashMap底层是哈希表，多线程，不安全，速度快一些。
 * HashMap可以存储null值，null键
 * HashTable不能存储null值null键
 *
 * HashTable和Vector在jdk1.2之后被HashMap和ArrayList取代了
 * HashTable的子类Properties依然在用，是唯一和IO流结合的集合
 */
public class Notes {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,"b");
        map.put(null,null);
        System.out.println(map);

        Hashtable<String,String> map2 = new Hashtable<>();
//        map2.put(null,"a");//NullPointerException
        map2.put("v",null);//NullPointerException

    }
}

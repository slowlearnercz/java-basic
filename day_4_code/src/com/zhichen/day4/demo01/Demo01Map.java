package com.zhichen.day4.demo01;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 8:38
 *
 * Map类的常用方法
 * public V put(K key, V value)   key不存在的话，插入新值，返回null；key已存在，新值覆盖旧值，返回旧值
 * public V remove(Object key)  把指定键对应的键值对从集合中删除，返回被删除的值；key若不存在，返回null
 * public V get(Object key)   根据指定的键，获取对应的值   key不存在返回null
 * boolean containsKey(Object key)  包含指定的键返回true，不包含返回false
 */
public class Demo01Map {
    public static void main(String[] args) {
        method2();
    }
    public static void method1(){
        Map<String, String> map = new HashMap<>();
        String v1 = map.put("李晨","范冰冰");
        System.out.println("v1:" + v1);//v1:null
        String v2 = map.put("李晨","范冰冰2");
        System.out.println("v2:" + v2);//v2:范冰冰
        System.out.println(map);//{李晨=范冰冰2}
        map.put("杨过","小龙女");
        System.out.println(map);
    }

    public static void method2(){
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",18);
        map.put("迪丽热巴",20);
        System.out.println(map);
//        int age = map.remove("赵丽颖");
//        System.out.println(age);
        Integer i = map.remove("小龙女"); //int类型不能接收null，Integer可以接收null。int接收报空指针异常
        System.out.println(i);
        System.out.println(map.get("迪丽热巴"));
        System.out.println(map.get("小龙女"));
        System.out.println(map.containsKey("赵丽颖"));
    }
}

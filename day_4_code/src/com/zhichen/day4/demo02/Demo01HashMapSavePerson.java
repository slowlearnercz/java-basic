package com.zhichen.day4.demo02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 9:56
 * <p>
 * HashMap存储自定义类型键值
 * 为保证key是唯一的，作为key的元素必须重写hashCode()和equals方法
 */
public class Demo01HashMapSavePerson {
    public static void main(String[] args) {
        method2();
    }

    private static void method2(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person("女王",80),"英国");
        map.put(new Person("嬴政",70),"秦国");
        map.put(new Person("女王",80),"俄国");
        //使用entrySet遍历
        Set<Map.Entry<Person, String>> entries = map.entrySet();
        for (Map.Entry<Person, String> entry : entries) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }

    private static void method1() {
        //前面的例子中，String作为key，因为其已经重写hashCode和equals
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京", new Person("张三", 18));
        map.put("上海", new Person("李四", 19));
        map.put("广州", new Person("王五", 20));
        map.put("北京", new Person("赵六", 18));
        //keySet遍历
        Set<String> set = map.keySet();
        for (String key : set) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}

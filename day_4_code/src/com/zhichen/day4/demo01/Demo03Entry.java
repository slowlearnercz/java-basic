package com.zhichen.day4.demo01;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 9:33
 *
 * Map.Entry<K,V>:
 *      Map接口中有一个内部接口Entry
 * 当Map集合创建，Map集合中就会创建一个Entry对象，用来记录键与值（键值与对象，键与值的映射关系）
 *
 * Set<Map.Entry<K,V>> entrySet()
 * 把Map集合内部的多个Entry对象取出来，存储到一个set集合中
 *
 *      Entry对象的方法getKey()获取key，getValue()获取value
 */
public class Demo03Entry {
    //Map集合遍历的第二种方式：使用Entry对象遍历
    //Set<Map.Entry<K,V>> entrySet()  返回此映射中包含的映射关系的Set视图
    //步骤：调用entrySet()，把Entry对象取出来存储到一个集合中，遍历Entry对象，使用getKey()和getValue()
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("迪丽热巴",169);
        map.put("杨颖",170);

        //注意获取集合的语法
        Set<Map.Entry<String,Integer>> set = map.entrySet();
        //注意for循环的语法，如果用迭代器也要注意，其实要注意的就是泛型
        for (Map.Entry<String, Integer> stringIntegerEntry : set) {
            System.out.println(stringIntegerEntry.getKey()+stringIntegerEntry.getValue());
        }
    }
}

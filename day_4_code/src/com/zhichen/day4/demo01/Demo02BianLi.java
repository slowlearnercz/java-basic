package com.zhichen.day4.demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 9:17
 *
 * Map遍历的方式
 *  Set<K> keySet()方法把Map集合中所有的key取出来存储到Set集合，Set集合就可以用迭代器/增强for循环遍历每一个k
 *  用get(key)获取每一个value
 */
public class Demo02BianLi {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("赵丽颖",168);
        map.put("迪丽热巴",170);
        map.put("林志玲",178);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(value);
        }
        for (String key : set) {
            System.out.println(key+map.get(key));
        }
    }
}

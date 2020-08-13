package com.zhichen.day4.demo03LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 10:34
 * <p>
 * LinkedHashMap是Map接口的哈希表和链表实现，具有可预知的迭代顺序
 */
public class Notes {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap();
        map.put("a","a");
        map.put("c","c");
        map.put("d","d");
        map.put("b","b");
        System.out.println(map);//{a=a, b=b, c=c, d=d}

        LinkedHashMap<String, String> map2 = new LinkedHashMap();
        map2.put("a","a");
        map2.put("c","c");
        map2.put("d","d");
        map2.put("b","b");
        System.out.println(map2);//{a=a, c=c, d=d, b=b}
    }
}

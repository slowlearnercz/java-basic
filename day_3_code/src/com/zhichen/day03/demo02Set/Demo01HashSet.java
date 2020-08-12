package com.zhichen.day03.demo02Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 16:30
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(1);
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("======");
        for (Integer integer : set) {
            System.out.println(integer);
        }
    }
}

package com.zhichen.day02.demo02Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 9:57
 */
public class Demo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("玛尔扎哈");
        Iterator<String> iterator = coll.iterator();

        while(iterator.hasNext()){
            String str = iterator.next();
            System.out.println(str);
        }
        System.out.println(coll);
    }
}

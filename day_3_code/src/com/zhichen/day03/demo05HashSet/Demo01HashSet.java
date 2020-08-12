package com.zhichen.day03.demo05HashSet;

import java.util.HashSet;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 14:34
 *
 * Set集合在调用add方法时，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
 */
public class Demo01HashSet {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String s1 = "abc";
        String s2 = "abc";
        set.add(s1);
        set.add(s2);
        set.add("重地");
        set.add("通话");
        set.add("abc");
        System.out.println(set);//[重地, 通话, abc]

    }
}

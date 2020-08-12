package com.zhichen.day03.demo05HashSet;

import java.util.HashSet;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 14:34
 *
 * Set集合在调用add方法时，add方法会调用元素的hashCode方法和equals方法，判断元素是否重复
 *      add方法调用s1的hashCode方法，计算字符串“abc”的哈希值是，是96354
 *      在集合中找有没有96354这个哈希值的元素，发现没有
 *      把s1存储到集合中
 *
 *      add方法调用s2的hashCode方法，计算字符串“abc”的哈希值是，是96354
 *  *      在集合中找有没有96354这个哈希值的元素，发现 ！有！出现哈希冲突
 *  *      s2调用equals方法和哈希值相同的元素进行比较，返回true
 *         哈希值相同且equals返回true,认定两个元素相同，不会将s2存储到集合中
 *
 *      重地和通话就同样的过程，先是存进第一个，add第二个是哈希值相同，再用equals判定
 *
 * 使用HashSet存储自定义类型元素时，需要重写hashCode()和equals方法，建立比较方式，才能保证HashSet集合中对象的唯一
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

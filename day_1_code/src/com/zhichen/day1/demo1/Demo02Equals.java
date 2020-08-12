package com.zhichen.day1.demo1;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 14:38
 *
 * public boolean equals(Object obj) {
 *         return (this == obj);
 *     }
 * 这种源码的情况下，equals跟==没有区别吧。对的没有区别，除非重写
 * 在String类中，是重写过的，用于比较字符串的值
 *
 * ==:比较运算符
 *      基本数据类型：比较对象是值
 *      引用数据类型：比较对象是对象的地址值
 *
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person p1 = new Person("迪丽热巴",18);
        Person p2 = new Person("迪丽热巴",18);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1.equals(p2));

        String a = "aaa";
        String b = "bbb";
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

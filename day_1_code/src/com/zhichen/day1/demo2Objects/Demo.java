package com.zhichen.day1.demo2Objects;

import java.util.Objects;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 15:31
 *
 * public static boolean equals(Object a, Object b) {
 *         return (a == b) || (a != null && a.equals(b));
 *     }
 * jdk作者的代码很简洁高效。
 * 在右侧的判断中a若为空那么直接不进行equals的判断
 */
public class Demo {
    public static void main(String[] args) {
        String s1 = null;
        String s2 = "bbb";
        System.out.println(Objects.equals(s1, s2));
    }
}

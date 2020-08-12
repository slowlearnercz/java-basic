package com.zhichen.day1.demo05StringBuilder;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-09 10:45
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(1);
        System.out.println(stringBuilder);
        String s = stringBuilder.toString();
        String a= "1";
        System.out.println(s.equals(a));
    }
}

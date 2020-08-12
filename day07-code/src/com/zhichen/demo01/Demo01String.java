package com.zhichen.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 11:10
 * String有三种构造方法
 * public String()
 * public String(char[] charlist)
 * public String(byte[] bytelist)
 * 还有一种直接创建方法
 */
public class Demo01String {
    public static void main(String[] args) {
        String str1 = new String();
        char[] charArray = {'a', 'b', 'c'};
        String str2 = new String(charArray);
        byte[] byteArray = {97,98,99};
        String str3 = new String(byteArray);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
    }
}

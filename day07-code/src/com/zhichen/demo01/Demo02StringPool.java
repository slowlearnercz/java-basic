package com.zhichen.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 11:19
 * <p>
 * 对于基本类型来说，==进行数值的比较
 * 对于引用类型来说，==进行地址的比较
 * <p>
 * 直接双引号创建的字符串常量，存在堆内存中
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        char[] charArray = {'a', 'b', 'c'};
        String str3 = new String(charArray);
        byte[] byteArray = {97, 98, 99};
        String str4 = new String(charArray);
        System.out.println(str1 == str2);
        System.out.println(str1 == str3);
        System.out.println(str2 == str3);
        System.out.println(str1 == str4);
    }
}

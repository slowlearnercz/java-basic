package com.zhichen.day1.demo06BaoZhuang;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-09 19:49
 *
 * String类型与基本数据类型的相互转换
 *
 * String转换成基本数据类型。
 * 除Character类之外，其他包装类都有parseXXX静态方法可以将字符串参数转换为对应的基本类型
 * public static byte parseByte(String s)
 * public static short parseShort(String s)
 * public static int parseInt(String s)
 * public static long parseLong(String s)
 * public static float parseFloat(String s)
 * public static double parseDouble(String s)
 * public static boolean parseBoolean(String s)
 *
 * 基本类型转换为String
 * 最简单的：
 * 1.使用+号连接即可
 * 2.包装类中的静态方法
 * static String toString(int i)返回一个表示指定整数的String对象
 * 3.使用String类的静态方法
 * static String valueOf(int i)返回int参数的字符串表示形式
 */
public class Demo02String {
    public static void main(String[] args) {
        int num = Integer.parseInt("32");//parse用法和DateFormat很相近，自己体会
        System.out.println(num-2);
    }
}

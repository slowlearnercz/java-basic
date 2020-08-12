package com.zhichen.day03.demo03Hash;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 16:34
 *
 * 哈希值：是一个十进制的整数，由系统随机给出（系统给对象模拟出来的模拟地址值，不是数据实际存储的物理地址）
 *
 * hashCode():
 * public native int hashCode();
 * native代表该方法调用的是本地操作系统的方法
 *
 * Object类默认的toString()
 * public String toString(){
 *     return getClass().getName + "@" + Integer.toHexString(hashCode());
 * }
 *
 * 以上两个方法输出的数字相同，哈希值以十进制表示，toString用十六进制表示（Hex）
 */
public class Notes {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.hashCode());

        Person p2 = new Person();
        System.out.println(p2.hashCode());//1163157884
        System.out.println(p2);//com.zhichen.day03.demo03Hash.Person@4554617c

        String str = new String("abc");
        String str2 = new String("abc");
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());
    }
}

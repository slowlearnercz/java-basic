package com.zhichen.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 11:49
 * <p>
 * public int length()
 * public String concat(String str)将当前字符串与参数字符串拼接在一起
 * public char charAt(int index)获取指定索引位置的单个字符
 * public int indexOf(string str)查找参数字符串在本字符串中首次出现的索引位置，如果没有返回-1
 */
public class Demo02StringGet {
    public static void main(String[] args) {
        //获取字符串的长度
        String str1 = "dafsdghgdhdh";
        System.out.println("字符串的长度为:" + str1.length());
        //拼接字符串,注意此方法是将拼接后的字符串作为返回值返回,原字符串不发生变化
        String str2 = "hello";
        System.out.println(str2);

        String str3 = str2.concat("world");
        System.out.println(str3);

        //获取指定位置的字符
        char c = "hello".charAt(1);
        System.out.println("在1号索引位置的字符是:" + c);

        //
        String original = "Helloworld";
        int index= original.indexOf("llo");
        System.out.println(index);
    }
}

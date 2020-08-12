package com.zhichen.demo02;

import java.util.ArrayList;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 15:30
 *
 * 字符串转换的常用方法
 * public char[] toCharArray()
 * public byte[] getBytes()
 * public String replace(CharSequence oldString, CharSequence newString)
 * charSequence看作是String即可
 */
public class Demo04StringConvert {
    public static void main(String[] args) {
        char[] chars = "Hello".toCharArray();
        System.out.println(chars);
        String[] name = {"李健","杨一民"};
        ArrayList<String> names = new ArrayList<>();
        names.add("李健");
        names.add("张洪翔");
        System.out.println(names);

        String str1 = "你好，李健！";
        System.out.println(str1);
        String str2 = str1.replace("李健","张洪翔");
        System.out.println(str2);

    }

}

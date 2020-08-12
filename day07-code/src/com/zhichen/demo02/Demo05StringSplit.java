package com.zhichen.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 15:46
 * <p>
 * public String[] split(String regex),按照参数规则，将字符串分成若干部分
 */
public class Demo05StringSplit {
    public static void main(String[] args) {
        String str1 = "aaa,bbb,ccc";
        String[] names = str1.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}

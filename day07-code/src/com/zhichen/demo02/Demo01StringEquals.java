package com.zhichen.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 11:32
 */
public class Demo01StringEquals {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str2.equals(str3));
        System.out.println("hello".equals(str1));
        System.out.println("Hello".equals(str1));

        //如果比较对象为一个常量和一个变量，建议是"常量".equals(变量)
        String str5 = null;
        System.out.println("hello".equals(str5));

        //以下情况会报空指针异常
        //System.out.println(str5.equals("hello"));
    }
}

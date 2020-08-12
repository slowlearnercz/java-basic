package com.zhichen.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-07-03 15:23
 * public String substring(int index)截取从参数位置开始一直到字符串末尾，将新字符串返回
 * public String substring(int begin,int end)截取从begin开始到end结束的字符串[begin,end)
 */
public class Demo03SubString {
    public static void main(String[] args) {
        //截取字符串
        String str1 = "HelloWorld!";
        String subStr1 = str1.substring(5);
        System.out.println(subStr1);

        String subStr2 = str1.substring(0,5);
        System.out.println(subStr2);
    }
}

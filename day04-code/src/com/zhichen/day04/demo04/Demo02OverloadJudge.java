package com.zhichen.day04.demo04;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-30 10:11
 */
public class Demo02OverloadJudge {
    public static void main(String[] args) {
        System.out.println(judge(2,2));
        System.out.println(judge('a','b'));
        System.out.println(judge(2.0,2.0));
    }
    public static boolean judge(int a,int b){
        return a==b;
    }
    public static boolean judge(byte a,byte b){
        return a==b;
    }
    public static boolean judge(double a,double b){
        return a==b;
    }
}

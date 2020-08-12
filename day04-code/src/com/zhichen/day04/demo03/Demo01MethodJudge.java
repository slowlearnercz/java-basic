package com.zhichen.day04.demo03;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-30 9:32
 */
public class Demo01MethodJudge {
    public static void main(String[] args) {
        if(judgeNumber(1,2))
            System.out.println("a和b相同");
        else
            System.out.println("a和b不同");
    }
    public static boolean judgeNumber(int a,int b){
        return a==b;
    }
}

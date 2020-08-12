package com.zhichen.day04.demo04;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-30 9:54
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1,2,3,4));
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b,int c){
        return a+b+c;
    }
    public static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
}

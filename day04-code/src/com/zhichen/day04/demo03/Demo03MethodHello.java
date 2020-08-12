package com.zhichen.day04.demo03;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-30 9:46
 */
public class Demo03MethodHello {
    public static void main(String[] args) {
        printHello(10);
    }
    public static void printHello(int a){
        for (int i = 0; i < a; i++) {
            System.out.println("Hello,world!" + (i+1));
        }
    }
}

package com.zhichen.day04.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-28 10:55
 */
public class Demo02Method {
    public static void main(String[] args) {
        printMethod();

    }
    public static void printMethod(){
        for (int i = 0; i < 5; i++) {
            for(int j = 1;j <= 20;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

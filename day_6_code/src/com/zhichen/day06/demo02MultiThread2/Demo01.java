package com.zhichen.day06.demo02MultiThread2;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:34
 */
public class Demo01 {
    public static void main(String[] args) {
        Thread t = new Thread(new RunnableImpl());
        t.start();

        for (int i = 0; i < 60; i++) {
            System.out.println("main:"+i);
        }
    }
}

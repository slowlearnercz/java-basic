package com.zhichen.day06.demo04Synchronized;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 15:11
 */
public class Demo {
    public static void main(String[] args) {
        RunnableImpl r = new RunnableImpl();

        Thread t0 = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t0.start();
        t1.start();
        t2.start();
    }
}

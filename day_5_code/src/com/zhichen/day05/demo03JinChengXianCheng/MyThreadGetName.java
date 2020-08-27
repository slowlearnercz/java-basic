package com.zhichen.day05.demo03JinChengXianCheng;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:15
 */
public class MyThreadGetName extends Thread {
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread);
    }
}

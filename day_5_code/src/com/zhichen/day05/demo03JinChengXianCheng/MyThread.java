package com.zhichen.day05.demo03JinChengXianCheng;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 10:18
 */
public class MyThread extends Thread {
    //第二步重写run方法
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+i);
        }
    }
}

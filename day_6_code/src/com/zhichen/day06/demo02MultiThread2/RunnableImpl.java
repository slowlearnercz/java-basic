package com.zhichen.day06.demo02MultiThread2;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:34
 */
public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 60; i++) {
            System.out.println("Runnable接口实现类多线程方式");
        }

    }
}

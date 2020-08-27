package com.zhichen.day06.demo04Synchronized;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 15:09
 *
 * 解决线程安全问题的第一种方案，使用同步代码块
 * 格式：
 *      synchronized(锁对象){
 *          代码（访问共享数据的代码）
 *      }
 * 注意：
 *      1.通过代码块中的锁对象，可以使用任意的对象
 *      2.保证多个线程使用的锁对象是同一个
 */
public class RunnableImpl implements Runnable {
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();

    @Override
    public void run() {
        while(true){
            //同步代码块
            synchronized(obj){
                if(ticket>0){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+"正在卖第"+ticket+"张票");
                    ticket--;
                }
            }

        }
    }
}

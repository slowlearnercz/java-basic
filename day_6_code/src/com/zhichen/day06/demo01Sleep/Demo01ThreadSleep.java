package com.zhichen.day06.demo01Sleep;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:25
 *
 * public static void sleep(long millis)：使当前正在执行的线程以指定的毫秒数暂停,毫秒数结束后线程继续执行
 */
public class Demo01ThreadSleep {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i < 60; i++) {
            System.out.println(i+1);

            //使用Thread类的sleep方法
            try {
                Thread.sleep(1000);//1000毫秒为1秒，有异常用trycatch
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

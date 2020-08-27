package com.zhichen.day05.demo03JinChengXianCheng;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 10:12
 *
 * 创建多线程程序的第一种方式：创建Thread类的子类
 *
 * 实现步骤：
 *      1，创建一个Thread类的子类
 *      2.子类中重写run方法，设置线程任务
 *      3.创建子类对象
 *      4.调用start方法，开启新的线程，执行run方法
 *          start方法源码说明：“使该线程开始执行；java虚拟机调用该线程的run方法。
 *          其结果是两个线程并发运行：main线程和创建的新线程（执行其run方法）
 */
public class Demo02MultiThread {
    public static void main(String[] args) {
        //第三步创建子类对象
        MyThread mt = new MyThread();
        //第四步调用start方法
        mt.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+i);
        }
    }
}

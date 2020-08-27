package com.zhichen.day05.demo03JinChengXianCheng;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:15
 */
public class Demo03ThreadName {
    public static void main(String[] args) {
        MyThreadGetName mt = new MyThreadGetName();
        mt.start();//Thread-0新线程的名称

        new MyThreadGetName().start();
        System.out.println(Thread.currentThread().getName());//main
    }
}

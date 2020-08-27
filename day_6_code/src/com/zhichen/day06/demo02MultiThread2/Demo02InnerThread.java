package com.zhichen.day06.demo02MultiThread2;

import javax.xml.stream.events.StartDocument;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:44
 *
 * 匿名内部类实现线程的创建
 *
 * 作用：简化代码
 *      将子类继承父类，重写父类方法，创建子类对象一步完成
 *      将实现类实现接口，重写接口的方法，创建实现类对象一步完成
 */
public class Demo02InnerThread {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName() + "接口" + i);
                }
            }
        };
        new Thread(r).start();
    }
}

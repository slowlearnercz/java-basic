package com.zhichen.day06.demo05Synchronized2;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 15:09
 *
 *
 * 解决线程安全问题的第二种方案：使用同步方法
 * 使用步骤：
 *      1.把访问共享数据的代码抽取出来，放入一个方法中
 *      2.用synchronized修饰方法
 *
 * 同步方法方案中，锁对象是谁？就是实现类创建的对象，new RunnableImpl（）
 */
public class RunnableImpl implements Runnable {
    private int ticket = 100;

    @Override
    public void run() {
        while(true){
            sellTicket();
        }
    }

    //定义一个同步方法
    public synchronized void sellTicket(){
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

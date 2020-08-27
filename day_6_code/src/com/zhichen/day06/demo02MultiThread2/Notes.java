package com.zhichen.day06.demo02MultiThread2;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 14:29
 *
 * 创建多线程的第二种方式：实现Runnable接口
 * java.lang.Runnable
 *      Runnable接口应该由那些打算通过某一线程执行其实例的类来实现。必须定义一个无参数的run方法
 * java.lang.Thread的构造方法
 *      Thread(Runnable target) 分配新的Thread对象
 *      Thread(Runnable target, String name) 分配新的Thread对象
 *
 * 实现步骤:
 *      1.创建一个Runnable接口的实现类，重写run方法，设置线程任务
 *      2.创建Thread类对象，构造方法中传递Runnable接口的实现类的对象
 *      3.调用start方法
 *
 * 用接口实现多线程的好处
 *      1.避免了单继承的局限性
 *      2.增强了程序的扩展性，降低了耦合性。设置线程任务和开启线程进行了分离
 */
public class Notes {
}

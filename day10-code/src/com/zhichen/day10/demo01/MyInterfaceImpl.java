package com.zhichen.day10.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 15:10
 */
public class MyInterfaceImpl implements MyInterface, MyInterfaceA {
    @Override
    public void method1() {
        System.out.println("覆盖重写了接口1");
    }

    @Override
    public void methodA() {
        System.out.println("覆盖重写了接口2");
    }
}

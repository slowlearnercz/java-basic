package com.zhichen.day11.demo04NoName;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 15:28
 */
public class MyInterfaceDrive {
    public static void main(String[] args) {
//        MyInterface myInterface = new MyInterfaceImpl();
//        myInterface.method();
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写了方法");
            }
        }.method();
        //匿名对象直接链式编程
    }
}

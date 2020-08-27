package com.zhichen.day4.demo06Debug;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-14 20:48
 *
 * Debug调试程序：
 *      让代码逐行执行；
 *      查看代码执行的过程；
 *      调试程序中出现的bug
 *
 * 使用方式：
 *      添加断点：行号右边，鼠标左键点击（每个方法的第一行，熟悉之后哪里有bug添加到哪里）
 *      右键选择debug执行，程序就停留在添加的第一个断点处
 *
 *      f8：逐行执行程序
 *      f7：进入到方法中
 *      shift+f8：跳出方法
 *      f9：跳到下一个断点，若没有就结束程序
 */
public class Notes {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);
//        for (int i = 0; i < 3; i++) {
//            System.out.println(i);
//        }
        print();
    }
    private static void print(){
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
        System.out.println("HelloWorld");
    }
}

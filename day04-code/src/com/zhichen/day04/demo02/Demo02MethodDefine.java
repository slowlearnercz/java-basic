package com.zhichen.day04.demo02;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-28 20:11
 *
 * 方法好比工厂，参数和返回值对应原料和产出
 */
public class Demo02MethodDefine {
    //定义一个二数相加的方法
    public static int addTwoNumber(int a, int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(addTwoNumber(2,3));
    }
}

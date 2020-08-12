package com.zhichen.day10.demo03;

import com.zhichen.day10.demo01.Fu;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 15:42
 */
public class Demo01Multi {
    public static void main(String[] args) {
        //使用多态
        Father obj = new Son();
        obj.method();
        obj.methodFa();
    }
}

package com.zhichen.day10.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 15:23
 */
public interface ZiInterface {
    public default void method(){
        System.out.println("接口方法执行");
    }
}

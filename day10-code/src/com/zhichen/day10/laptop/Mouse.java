package com.zhichen.day10.laptop;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:55
 */
public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }

    public void click(){
        System.out.println("使用鼠标进行点击");
    }
}

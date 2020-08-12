package com.zhichen.day10.laptop;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 16:56
 */
public class KeyBoard implements USB {
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }

    public void input(){
        System.out.println("使用键盘进行输入");
    }
}

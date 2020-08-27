package com.zhichen.day05.demo02MyException;

import java.util.Scanner;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 8:37
 *
 * 模拟注册操作，如果用户名已存在，抛出异常并提示：该用户名已注册
 *
 * 分析：
 * 1使用数组保存已经注册过的用户名
 * 2使用Scanner获取用户输入
 * 3定义方法，对输入进行判断
 *      遍历数组，获取每一个用户名；进行比较；true用户名已存在，抛出异常，false继续遍历；循环结束还无重复，则注册成功
 */
public class Demo01MyException {
    static String[] username = {"张三","李四","王五"};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String user = sc.next();
        checkUserName(user);
    }

    public static void checkUserName(String user) {
        for (String name : username) {
            if(name.equals(user)){
                try {
                    throw new RegisterException("该用户名已存在");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;//return的作用是结束方法，否则下方注册成功会执行
                }
            }
        }
        System.out.println("注册成功");
    }
}

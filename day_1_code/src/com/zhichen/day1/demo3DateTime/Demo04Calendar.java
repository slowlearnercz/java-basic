package com.zhichen.day1.demo3DateTime;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 17:13
 *
 * Calendar类是一个抽象类
 * Calendar calendar = Calendar.getInstance();送了一个静态方法，可用来直接创建对象
 *
 * 成员方法
 * public int get(int field) 返回给定日历字段的值
 * public void set(int field, int value)
 * public abstract void add(int field, int amount)
 * public Date getTime()
 *
 * 为什么参数是int类型呢，因为该类把域都定义为了int类型常量
 * YEAR=1   除了用1 我还可以用Calendar.YEAR来获取
 * MONTH=2
 * DATE=5 月中的天
 * DAY_OF_MONTH=5
 * HOUR=10
 * MINUTE=12
 * SECOND=13
 */
public class Demo04Calendar {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR));

//        c.set(Calendar.YEAR, 2022);//2020->2022
//        System.out.println(c.get(Calendar.YEAR));

//        c.add(Calendar.YEAR, 2);//2020->2022,传递正数增加，传递负数就减少
//        System.out.println(c.get(Calendar.YEAR));

        //不同于Date类中getTime方法是返回毫秒值，日历类的getTime方法是返回一个Date类对象
        Date time = c.getTime();
        System.out.println(time);//Sun Aug 09 09:44:55 CST 2020
    }
}

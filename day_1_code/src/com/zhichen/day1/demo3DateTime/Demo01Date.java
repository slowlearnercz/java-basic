package com.zhichen.day1.demo3DateTime;

import java.util.Date;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 15:52
 *
 * 类Date表示特定的瞬间，精确到毫秒（千分之一秒）
 * 毫秒值的作用：对时间和日期进行计算
 * 例如问2099-01-03到 2088-01-01中一共有多少天
 * 先把两个日期转换为毫秒，再把毫秒的差除以天
 *
 * 时间原点（0毫秒）：1970年1月1日 00：00：00.
 *
 * 毫秒转换为日期
 */
public class Demo01Date {
    public static void main(String[] args) {
//        System.out.println(System.currentTimeMillis());//获取当前时间的毫秒值，对比时间原点
        //method3();

    }


    //Date无参构造方法
    private static void method1(){
        Date date = new Date();//获取当前系统的日期和时间
        System.out.println(date);//Sat Aug 08 16:01:45 CST 2020
    }

    //Date带参构造方法
    //Date(long date):把参数毫秒值转换成Date日期
    private static void method2(){
        Date date = new Date(0L);//Thu Jan 01 08:00:00 CST 1970
        System.out.println(date);//八点是因为中国处于东八区，要加8个小时
    }

    //成员方法getTime().把日期转换成毫秒
    private static void method3(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}

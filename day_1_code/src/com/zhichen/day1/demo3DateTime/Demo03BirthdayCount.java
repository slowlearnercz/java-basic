package com.zhichen.day1.demo3DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 16:44
 * <p>
 * 使用日期时间相关的API，计算一个人已经出生了多少天
 * 思路：获取当前date，出生日期采用字符串参数的方式进行转换。
 * getTime方法把date转换成浮点数值，一天是86400000毫秒
 */
public class Demo03BirthdayCount {
    public static void main(String[] args) throws ParseException {
        System.out.println(birthdayCount());
    }

    public static int birthdayCount() throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入出生日期：yyyy-MM-dd");
        String birthdate = sc.next();
        Date dateNow = new Date();//创建当前时间的date对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dateBirth = sdf.parse(birthdate);//出生日期转换为date对象，以计算毫秒值
        long msCounts = dateNow.getTime() - dateBirth.getTime();//计算相差的毫秒数
        System.out.println(msCounts);
        int birthdayCounts = (int) (msCounts/86400000L);
        return birthdayCounts;
    }
}

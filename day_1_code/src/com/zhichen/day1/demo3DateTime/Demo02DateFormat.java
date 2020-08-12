package com.zhichen.day1.demo3DateTime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 16:19
 *
 * 使用这个类把date和String进行互相转换
 * 格式化：日期 -> 文本  把日期按照指定格式转换成文本
 * 解析： 文本 -> 日期
 *
 * 成员方法
 * String format(Date date)  按照指定模式，把日期转换成字符串
 * Date parse(String source)   把符合模式的字符串，解析为Date日期
 *
 * 其是抽象类，我们在使用中使用子类SimpleDateFormat
 * SimpleDateFormat(String pattern)   用给定模式参数的构造方法
 *
 * y  年
 * M  月
 * d  日
 * H  时
 * m  分
 * s  秒
 *
 * 写对应的模式，其会把对应的模式替换成对应的日期时间
 * "yyyy-MM-dd HH:mm:ss"
 *
 */
public class Demo02DateFormat {
    public static void main(String[] args) throws ParseException {
//        Date date = new Date();
//        SimpleDateFormat time = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
//        System.out.println(time.format(date));
//        System.out.println(date);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String time = "2020-08-08";
        Date date = sdf.parse(time);
        System.out.println(date);
    }

}

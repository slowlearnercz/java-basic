package com.zhichen.day1.demo3DateTime;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-09 9:52
 *
 * 日期相关类的总结
 * 1.Date类
 *      A.构造方法
 *      Date()根据当前系统时间创建对象
 *      Date(long time)使用参数time代表的毫秒值创建对象
 *      B.成员方法
 *      long getTime()   获取当前时间的毫秒值时间
 *      String toLocalString()  根据本地格式转换日期对象 //此方法已被遗弃
 *
 * 2.DateFormat类&SimpleDateFormat类
 *      A.构造方法
 *      SimpleDateFormat(String pattern)  根据输入的字符串模式创建日期格式化对象
 *      B.成员方法
 *      String format(Date d)  将Date对象转换为按照模板格式书写的日期字符串
 *      Date parse(String s)   按照格式解析字符串s成为Date对象
 *
 * 3.Calendar类
 *      A.构造方法
 *      Calendar c = Calendar.getInstance();   此类是一个抽象类，不能直接声明对象，成员方法getInstance返回
 *      一个子类对象，用这种方式来创建对象
 *      B.成员方法
 *      注意下面这些方法的参数，如果记不住数字，可以用Calendar.YEAR/MONTH等名称代替.注意这里的月份取值范围是0-11，所以要加一
 *      int get(int field)
 *      void set(int field, int value)
 *      void add(int field, int value)
 *      Date getTime()以当前的日历对象返回一个Date类对象
 */
public class Notes {
}

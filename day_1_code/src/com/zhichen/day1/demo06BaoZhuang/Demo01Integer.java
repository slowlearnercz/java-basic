package com.zhichen.day1.demo06BaoZhuang;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-09 11:27
 * <p>
 * 装箱/拆箱
 * 装箱：把基本类型的数据，包装成包装类
 * 构造方法：
 * Integer(int a)
 * Integer(String a)
 * 静态方法:
 * static Integer valueOf(int i)返回一个表示i值的Integer实例
 * static Integer valueOf(String i)
 * 拆箱：从包装类取出基本类型的数据
 * 成员方法：
 * int intValue()
 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱
        Integer integer = new Integer(1);
        System.out.println(integer);//1   此结果说明Integer重写了toString方法
        Integer integer1 = new Integer("1");
        System.out.println(integer1);
        Integer integer2 = Integer.valueOf(1);

        //拆箱
        int i = integer.intValue();
        System.out.println(i);

        //自动装箱  jdk1.5之后支持
        //int类型的整数，直接赋值给包装类
        //等同于Integer in = new Integer(3);
        Integer in = 3;

        //自动拆箱
        //相当于in.intValue()+4
        int sum = in + 4;
        System.out.println(sum);

        //ArrayList集合无法直接存储整数，只能存储Integer这种包装类。
        //自动拆装箱，方便了集合类存储使用基本类型
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);//自动装箱
        int a = list.get(0);//自动装箱
    }
}

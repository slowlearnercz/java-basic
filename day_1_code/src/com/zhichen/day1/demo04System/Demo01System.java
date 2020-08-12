package com.zhichen.day1.demo04System;

import java.util.Arrays;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-09 10:17
 *
 * System类常用的静态方法
 * public static long currentTimeMillis()  返回当前时间的毫秒值--用途-测试程序的效率，运行时间。程序执行前跑一次，执行结束跑一次，时间差
 * public static void arraycopy(Object src, int srcPos, Object dest, int destpos, int length)
 *      src 源数组
 *      srcPos-源数组的起始位置
 *      dest-目标数组
 *      destPos-目标数组起始位置
 *      length-要复制元素的数量
 */
public class Demo01System {
    public static void main(String[] args) {
        method2();
    }

    public static void method1(){
        long start = System.currentTimeMillis();//程序开始前获取一次毫秒值
        for (int i = 0; i < 9999; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("程序共耗时："+(end-start)+"毫秒");
    }

    public static void method2(){
        //将src数组的前3个元素，复制到dest数组的前三个位置上
        //复制前src[1,2,3,4,5]   dest[6,7,8,9,10]
        //复制后src[1,2,3,4,5]   dest[1,2,3,9,10]
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println(Arrays.toString(dest));
    }
}

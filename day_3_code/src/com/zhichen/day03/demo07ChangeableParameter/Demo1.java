package com.zhichen.day03.demo07ChangeableParameter;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-12 15:26
 *
 * 可变参数：jdk1.5之后出现的特性
 * 使用场景：
 *      方法的参数列表数据类型已经确定，但是参数的个数不确定，可以使用可变参数
 * 使用格式：
 *      修饰符 返回值类型 方法名（数据类型...变量名）{}
 *
 * 原理：
 *      可变参数底层是数组，根据传递参数个数不同，创建不同长度的数组，来存储这些参数。
 *      传递参数的个数可以0-多个
 *
 * 注意：
 *      一个方法只能用一次可变参数
 *      void method(int...a, String...b) //报错
 *      如果有别的参数，可变参数放在末尾
 *      void method(int...a, String b, double c)//报错
 *      void method(String b, double c, int...a)//可以
 */
public class Demo1 {
    public static void main(String[] args) {
        add(10,20);//arr.length=2,创建一个长度为2的数组，存储传递过来的参数new int[]{10,20}
    }

    //定义一个方法，计算n个int类型整数的和。参数个数不确定，我们使用可变参数
    public static int add(int...arr){
        System.out.println(arr);//[I@1b6d3586 数组的地址
        System.out.println(arr.length);
        return 1;

    }

}

package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:16
 *
 * 定义一个有泛型的方法，定义在修饰符和返回值类型之间
 * 格式：
 *    修饰符 <泛型> 返回值类型 方法名（参数列表（使用泛型））{
 *        方法体;
 *    }
 */
public class GeneralMethod {
    public <M> void method1(M m){
        System.out.println(m);
    }
}

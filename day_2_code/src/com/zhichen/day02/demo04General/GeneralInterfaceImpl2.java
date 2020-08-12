package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:38
 *
 * 含有泛型的接口第二种使用方式：接口使用什么泛型，实现类就用什么泛型，类跟着接口走
 * 相当于定义一个含有泛型的类，创建对象的时候再确定泛型类型
 */
public class GeneralInterfaceImpl2<I> implements GeneralInterface<I> {
    @Override
    public void method1(I i) {
        System.out.println(i);
    }
}

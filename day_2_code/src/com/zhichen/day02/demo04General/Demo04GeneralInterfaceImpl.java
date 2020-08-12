package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:33
 *
 * 含有泛型的接口，第一种使用方式：定义接口的实现类，实现接口，指定接口的泛型
 */
public class Demo04GeneralInterfaceImpl implements GeneralInterface<String>{
    @Override
    public void method1(String s) {
        System.out.println(s);
    }
}

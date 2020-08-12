package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:08
 *
 * 定义一个含有泛型的类，模拟ArrayList集合
 * 泛型是一个未知的数据类型，可以接收任意的数据类型，可以使用Integer/String
 *
 * 创建对象的时候指定泛型类型，类似于ArrayList的用法
 * 对象调用类中方法的时候，用相应类型的属性
 */
public class GeneralClass<E> {
    private E e;

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public GeneralClass(E e) {
        this.e = e;
    }

    public GeneralClass() {
    }
}

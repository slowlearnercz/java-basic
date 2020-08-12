package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:36
 */
public class Demo04Drive {
    public static void main(String[] args) {
        Demo04GeneralInterfaceImpl giim = new Demo04GeneralInterfaceImpl();
        giim.method1("使用接口泛型");

        GeneralInterfaceImpl2<String> giim2 = new GeneralInterfaceImpl2<>();
        giim2.method1("da");

        GeneralInterfaceImpl2<Integer> giim3 = new GeneralInterfaceImpl2<>();
        giim3.method1(2);
    }
}

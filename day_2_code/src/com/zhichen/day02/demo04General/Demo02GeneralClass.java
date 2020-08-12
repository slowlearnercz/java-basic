package com.zhichen.day02.demo04General;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 17:09
 */
public class Demo02GeneralClass {
    public static void main(String[] args) {
        GeneralClass gc = new GeneralClass();
        gc.setE("字符串还是可以用，不指定泛型的情况下");
        System.out.println(gc.getE());

        //指定泛型类型
        GeneralClass<Integer> gcIn = new GeneralClass<>();
        gcIn.setE(100);
        System.out.println(gcIn.getE());
    }
}

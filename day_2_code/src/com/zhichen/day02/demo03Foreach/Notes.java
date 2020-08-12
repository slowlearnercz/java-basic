package com.zhichen.day02.demo03Foreach;

import java.util.ArrayList;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 11:11
 * <p>
 * for循环的增强版。底层使用迭代器，简化迭代器的书写，jdk1.5之后出现的新特性
 * 用来遍历集合和数组
 * 格式：
 *      for(数据类型 变量名 : 集合名/数组名){
 *          System.out.println(变量名)
 *      }
 *
 * 注意：
 *  for增强循环必须有被遍历的目标，目标只能是Collection或者是数组。只能用作遍历使用
 */
public class Notes {
    public static void main(String[] args) {
        method2();
    }

    public static void method1() {
        int[] arr = {1, 2, 3, 4};
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static void method2(){
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String str : list){
            System.out.println(str);
        }
    }
}

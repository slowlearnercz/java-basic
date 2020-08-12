package com.zhichen.day03.demo01;

import java.util.LinkedList;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 16:11
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        //LinkedList不能使用多态
        method3();
    }
    private static void method(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("d");//addLast与add等效
        System.out.println(list);

//        list.addFirst("www");
        list.push("www");//与上等效
        System.out.println(list);

        list.addLast("com");
        System.out.println(list);

    }
    private static void method2(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("d");
        System.out.println(list);

//        list.clear();
        if(!list.isEmpty()) {
            String first = list.getFirst();
            System.out.println(first);

            String last = list.getLast();
            System.out.println(last);
        }
    }

    private static void method3(){
        LinkedList<String> list = new LinkedList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("d");

//        String first = list.removeFirst();
        String first = list.pop();
        System.out.println(first);
        System.out.println(list);

        String last= list.removeLast();
        System.out.println(last);
        System.out.println(list);
    }
}

package com.zhichen.day05.demo01Exception;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-17 21:42
 *
 * 前述异常是编译时异常，例如写解析日期代码时，将日期字符串写错
 * 本例展示的是运行时异常，即类名所示字面意思
 */
public class Demo02RunTimeException {
    public static void main(String[] args) {
        int[] arr = {0,1,2};
        try{
            System.out.println(arr[3]);
        }catch(Exception e){
            //出现异常之后怎么处理
            System.out.println(e);
        }
        /*
        Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
	at com.zhichen.day05.demo01Exception.Demo02RunTimeException.main(Demo02RunTimeException.java:14)
         */
        //数组的索引溢出，就属于运行时发生的错误了（不过想想也可以算是编译阶段的异常）
    }
}

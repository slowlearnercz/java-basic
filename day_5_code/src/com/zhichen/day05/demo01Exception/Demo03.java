package com.zhichen.day05.demo01Exception;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-26 19:07
 *
 * 异常产生的过程
 *
 * 数组没有3这个索引，JVM检测出程序出现异常
 * 紧接着JVM做两件事
 *      1根据异常产生的原因创建一个异常对象，包含异常产生的内容、原因和位置
 *      2由于getArray方法没有异常的处理逻辑（try，catch），JVM会把异常对象抛给方法的调用者--main方法处理
 * main方法接收到异常对象，他也没有异常的处理逻辑，继续把异常对象抛给main方法的调用者JVM处理
 * JVM接收到异常对象，做两件事
 *      1把异常对象（内容、原因、位置）以红色字体打印在控制台
 *      2JVM终止当前正在执行的java程序
 */
public class Demo03 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int e = getArrayByIndex(arr,3);
        System.out.println(e);
    }

    //定义一个方法，获取数组指定索引处的元素
    //参数： int[] arr, int index
    public static int getArrayByIndex(int[] arr, int index){
        int ele =  arr[index];
        return ele;
    }
}

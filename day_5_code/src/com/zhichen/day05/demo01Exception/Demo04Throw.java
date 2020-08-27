package com.zhichen.day05.demo01Exception;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-26 19:21
 *
 * 处理异常的五个关键字：try  catch  finally  throw  throws
 *
 * throw的作用：可以使用throw关键字在指定的方法中抛出指定的异常
 *
 * 使用格式：
 *      throw new xxxException("异常产生的原因")
 * 注意：
 *      throw关键字必须写在方法内部
 *      throw后边new的对象必须是Exception或者其子类
 *      抛出指定的异常对象，我们就必须处理
 *          throw后面创建的是RuntimeException或者其子类对象，可以不处理，默认交给JVM处理（打印异常，中断程序）
 *          后面创建的是编译异常，要么throws，要么try catch
 */
public class Demo04Throw {
    public static void main(String[] args) {
//        int[] arr = null;
//        int e = getArrayByIndex(arr,0);
        int[] arr ={1,2,3};
        int e = getArrayByIndex(arr,3);
    }

    //定义一个方法，获取数组指定索引处的元素
    //参数： int[] arr, int index

    //在工作中，我们首先必须对方法传递过来的参数进行合法性校验
    //如果参数不合法，那么我们必须使用抛出异常的方式，告知方法的调用者，传递的参数有问题

    //注意NullPointerException是一个运行期异常，我们不用处理，默认交给jvm处理
    public static int getArrayByIndex(int[] arr, int index) {
        //对传递过来的参数数组，进行合法性校验，如果数组arr的值是null，那么抛出空指针异常，告知方法调用者“传递的数组值为null”
        if(arr==null){
            throw new NullPointerException("传递的数组值为null");//这里就是调用的格式实例了
        }

        //还可以对参数index进行合法性校验，如果index的范围不在数组范围内，抛出数组索引越界异常，告知方法调用者“传递的索引超出数组适用范围”
        if(index<0 || index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("传递的索引超出数组边界");
        }
        int ele = arr[index];
        return ele;
    }
}

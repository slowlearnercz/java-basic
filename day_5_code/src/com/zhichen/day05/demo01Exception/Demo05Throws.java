package com.zhichen.day05.demo01Exception;

import java.io.FileNotFoundException;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-26 19:52
 *
 * throws关键字：异常处理的第一种方式，交给别人处理
 *
 *
 * 格式：方法声明时使用
 *      修饰符 返回值类型 方法名（参数列表） throws AAAException,BBBException{}
 *
 * 注意：
 *      throws关键字必须写在声明处，声明的异常必须是Exception或者其子类
 *      如果方法内部抛出多个异常对象，throws后边必须也声明多个异常
 *          如果多个异常之间存在父子类关系，直接声明父类异常即可
 *      若调用一个声明中抛出异常的方法，就必须进行相应处理
 *          要么也使用throws声明抛出，交给方法的调用者处理，最终交给JVM
 *          要么try catch自己处理异常
 */
public class Demo05Throws {
    public static void main(String[] args) throws FileNotFoundException{
        readFile("c:\\a.txt");
    }

    //定义一个方法，对传递的文件路径进行合法性判断
    //如果路径不是"c://a.txt"，那么我们就抛出“文件找不到”异常，告知方法调用者
    //注意FileNotFoundException是编译异常，抛出了就必须处理
    //可以使用throws继续声明抛出,即在readFile的方法声明中使用throws，接住throw
    public static void readFile(String fileName) throws FileNotFoundException{
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
    }
}

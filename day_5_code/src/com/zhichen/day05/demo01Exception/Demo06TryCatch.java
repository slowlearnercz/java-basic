package com.zhichen.day05.demo01Exception;

import java.io.FileNotFoundException;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-26 20:42
 *
 * 格式：
 *      try{
 *          可能产生异常的代码段
 *      }catch(定义一个异常类型的形参，接收try抛出的异常){
 *          异常的处理逻辑
 *      }
 */
public class Demo06TryCatch {
    public static void main(String[] args) {
        try{
            readFile("c:\\c.txt");
        }catch(FileNotFoundException e){
            e.printStackTrace();//JVM默认输出方法
        }
        System.out.println("后续代码");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        if(!fileName.equals("c:\\a.txt")){
            throw new FileNotFoundException("传递的文件路径不是c:\\a.txt");
        }
    }
}

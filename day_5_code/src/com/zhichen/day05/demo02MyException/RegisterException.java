package com.zhichen.day05.demo02MyException;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-27 8:44
 *
 * 自定异常类
 *  * extends Exception/RuntimeException
 *  *      添加一个空参数的构造方法
 *  *      添加一个带异常信息的构造方法
 *  * 注意：
 *  *      继承Exception，自定义的异常类就是一个编译期异常，如果方法内部抛出编译期异常，必须处理，throws或者try catch
 *  *      继承RuntimeException，那么就是一个运行期异常，可交给虚拟机处理（中断处理）
 */
public class RegisterException extends Exception {
    public RegisterException(){
        super();
    }

    //带异常信息的构造方法，源码中，所有的异常类都有一个带异常信息的构造方法，调用父类带异常信息的构造方法super(s)
    public RegisterException(String message){
        super(message);
    }
}

package com.zhichen.day11.demo03InnerClass;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 14:55
 */
public class MethodOuter {
    public void methodOuter(){
        class Inner{
            int num = 10;
            public void methodInner(){
                System.out.println(num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner();
    }
}

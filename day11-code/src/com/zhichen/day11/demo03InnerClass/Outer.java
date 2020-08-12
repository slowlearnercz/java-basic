package com.zhichen.day11.demo03InnerClass;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 11:09
 */
public class Outer {
    public class Inner{
        //成员内部类
        int num = 20;
        public void beat(){
            System.out.println("内部类方法执行");
            System.out.println("我叫:" + name);
        }
        public void printNum(){
            int num = 30;
            System.out.println(num); // 输出内部类的局部变量，就近原则
            System.out.println(this.num);//输出内部类的成员变量，使用this关键字
            //那么要怎么输出外部类的num呢，用super会报错，毕竟不是继承关系
            System.out.println(Outer.this.num);//外部类.this.成员变量名
        }
    }

    private String name;
    int num = 10;
    public void method(){
        System.out.println("外部类方法执行");
        new Inner().beat();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

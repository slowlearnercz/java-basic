package com.zhichen.day11.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 10:00
 *
 * final的四种常见用途
 * 1修饰类
 *      final关键字写在class之前
 *      final修饰的类不能有子类
 * 2修饰方法
 *      final修饰的方法为最终方法，不能被覆盖重写，写在返回值类型之前
 *      不能覆盖重写父类中的final方法（点一下，只有继承关系里才会出现重写，重载改改参数就可）
 *      abstract和final不能同时使用，抽象方法必须重写，而final方法不允许重写
 * 3修饰局部变量
 *      final修饰的局部变量，不能进行更改
 *      final int num = 20;
 *      num = 10；//报错
 *      num = 20；//也报错，不允许对其进行重新赋值语句
 *
 *      final int num;
 *      num = 20;//这样可以，赋值一次
 *
 *      对于基本类型来说，不可变的是变量当中的数值
 *      对于引用类型来说，不可变的是变量存储/指向的地址值
 *      final Student stu = new Student();
 *      //该语句下stu不能再指向别的Student对象的引用，但是里面的值是可以变的
 *      Stu.setname()方法是可以使用的
 * 4修饰成员变量
 *      成员变量和局部变量的区别
 *      成员变量具有默认值，因此使用了final之后就必须手动赋值，不会给默认值的，不赋值就会报错
 *      ②赋值之后，set方法和构造方法都会报错，因为其是不能改的
 *      ③定义的时候不赋值，用构造方法赋值，并且取消set也是可以通过编译的
 *      也就是final成员变量，要赋一个值，且不允许修改
 */
public class Notes {
}

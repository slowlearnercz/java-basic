package com.zhichen.day10.demo03;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-05 15:37
 *
 * 已知存在两个类，人类为父类，学生为子类
 * 学生类有一个对象-小明
 * 多态：小明这个对象有多个形态，既有学生形态也有人类形态
 *
 * 代码当中体现多态的形式：父类引用指向子类对象
 * 格式：父类名称 对象名 = new 子类名称（）;
 * 左父右子
 * 或者：接口名称 对象名 = new 实现类名称（）;
 *
 *
 * 在继承和多态中
 * 成员变量看声明代码行的等号=左边是谁，成员方法看右边是谁，子类若有就用子类的，没有则向上找
 *
 * 口诀
 * 成员变量：编译看左边，运行还看左边
 * 成员方法：“编译看左边，运行看右边”
 *
 * 多态的格式就是一种向上转型。
 * 左父右子
 *      创建子类对象，把它当作父类来看待。
 *      new一只猫，将其当成动物来看待
 * 那么向上转型一定是安全的。因为是从小范围转向了大范围
 *
 * 对象一旦向上转型为父类，子类原本特有的内容就无法调用。猫会抓老鼠，但不是所有动物都会抓老鼠，因此编译报错
 * 解决方案：对象向下转型【还原】
 * 只能还原成本子类，不能向下转型为别的子类，猫能还原到猫，不能还原到狗   ClassCastException
 * 格式：子类名称 对象名 = （子类名称）父类对象；
 *
 * 向上转型
 * Animal animal = new Cat();
 *
 * 还原：
 * Cat cat = (Cat) animal;
 *
 * 如何知道父类对象的引用指向的是猫还是狗呢，其本来是什么子类
 * 使用instanceof关键字
 * 对象名称 instanceof 类名称
 * 返回一个boolean值
 * animal instanceof Cat // 给出一个true
 */

public class Notes {
}

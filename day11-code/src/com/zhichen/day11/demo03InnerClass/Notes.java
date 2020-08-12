package com.zhichen.day11.demo03InnerClass;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-07 11:03
 *
 * 一个事物的内部包含另一个事物，这就是一个类内部包含另一个类
 * 例如：人的身体和心脏的关系；汽车和发动机的关系。part不能独立存在，要在外部主体中才能发挥作用
 *
 * Java内部类的类型
 * 1成员内部类
 *      修饰符 class 外部类名称{
 *          修饰符 class 内部类名称{
 *
 *          }
 *      }
 * 注意：内用外，可以用随意访问，权限不受限制
 *      外用内，需要借助内部类对象
 * 使用方式：
 * ①外部类方法当中，使用内部类；main调用外部类方法（间接方式）
 * ②直接调用
 *      [外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();]
 *      确实是有链式语法的味道，但是要注意括号
 *
 * 2局部内部类（包含匿名内部类）
 * 局部内部类定义在方法内部，只有当前方法才能使用，出了方法外面就不能使用
 *      修饰符 class 外部类名称{
 *          修饰符 返回值类型 方法名称（）{
 *              class 局部内部类名称{
 *                  ...
 *              }
 *          }
 *      }
 *
 *
 * 类使用权限修饰符的规则
 * 1外部类：public / (default)
 * 2成员内部类：public/protected/(default)/private
 * 3局部内部类  没得选，也没有默认
 */
public class Notes {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //通过外部类对象outer，调用外部类的方法，里面间接调用内部类
        outer.method();
        System.out.println("=======================");
        Outer.Inner directInner = new Outer().new Inner();
        directInner.beat();
        directInner.printNum();
    }
}

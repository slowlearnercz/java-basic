package com.zhichen.day03.demo01;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 15:10
 *
 * ArrayList底层通过数组结构实现，查询快，增删慢。因为数组的长度固定不可变，增删的操作都会创建新的数组
 *
 * LinkedList底层是链表结构，查询慢，增删快，增删对头尾节点操作；
 * 包含大量操作首尾元素的方法。
 * 注意：使用LinkedList集合特有的方法，不能使用多态
 *      public void addFirst(E e)  将指定元素插入此列表的开头
 *      public void addLast(E e)   将指定元素添加到此列表的结尾
 *      public void push(E e)      将元素压入此列表表示的堆栈
 *
 *      public E getFirst()        返回此列表的第一个元素
 *      public E getLast()         返回此列表的最后一个元素
 *
 *      public E removeFirst()     移除并返回此列表的第一个元素
 *      public E removeLast()      移除并返回此列表的最后一个元素
 *      public E pop()             从此列表所表示的堆栈处弹出一个元素
 *
 *      public boolean isEmpty()   列表为空，则返回true
 */
public class Notes {
}

package com.zhichen.day02.demo02Iterator;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 9:47
 *
 * Iterator迭代器(对集合进行遍历)
 * 常用方法
 *      boolean hasNext()  判断集合中是否有下一个元素，若有，则返回true
 *      E next()           取出集合中的下一个元素
 *
 * Iterator是接口，我们无法直接使用
 * Collection接口中有一个方法，叫iterator(),这个方法返回的就是迭代器实现类的对象
 * Iterator<E> iterator() 返回在此collection的元素上进行迭代的迭代器
 *
 * 迭代器的使用步骤
 *      1.使用集合的方法iterator()获取迭代器实现类对象，使用Iterator()接收（多态）
 *          迭代器的泛型跟着collection走
 *      2.hasNext()判断还有没有下一个元素
 *      3.next()取出集合中的下一个元素
 */
public class Notes {
}

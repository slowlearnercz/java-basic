package com.zhichen.day03.demo04HashTable;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 16:46
 *
 * jdk1.8之前   哈希表由数组+链表实现
 * jdk1.8之后   哈希表由数组+红黑树(提高查询速度）实现
 *
 * 数组结构：把元素进行了分组（相同哈希值的元素是一组）
 * 链表/红黑树把相同哈希值的元素连接到一起
 *
 *
 *横数组  竖链表
 *  0     1    2    3     4 --15  初始容量16
 * | | 96354  | |1179395 | | |
 *        |         |
 *      “abc”     “重地”
 *                  |
 *                “通话”
 */
public class Notes {
}

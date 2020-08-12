package com.zhichen.day02.demo01;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-10 9:08
 *
 * Collection的共性方法
 * public boolean add(E e)  添加对象到集合中
 * public void clear()  清空集合中的所有元素
 * public boolean remove(E e)   在集合中移除给定元素
 * public boolean contains(E e)  判断集合中是否包含给定元素
 * public boolean isEmpty()    判断当前集合是否为空
 * public int size()         给出集合当前元素个数
 * public Object[] toArray()   把集合中的元素存储到数组中
 */
public class Demo01Collection {
    public static void main(String[] args) {
        //使用多态创建对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);  //[]  不是打印地址，说明重写了toString方法
        System.out.println("集合为空吗？："+coll.isEmpty());//集合为空吗？：true
        coll.add("张三"); //返回值是boolean类型，不需要接收
        System.out.println("集合为空吗？："+coll.isEmpty());//集合为空吗？：false
        coll.add("迪丽热巴");
        coll.add("古力娜扎");
        coll.add("玛尔扎哈");
        System.out.println(coll);
        coll.remove("张三");
        System.out.println(coll);
        System.out.println("当前集合中包含迪丽热巴吗"+coll.contains("迪丽热巴"));
        System.out.println("集合当前元素个数："+coll.size());
        Object[] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        coll.clear();
        System.out.println("集合为空吗？："+coll.isEmpty());//集合为空吗？：True
        System.out.println("集合当前元素个数："+coll.size());
    }
}

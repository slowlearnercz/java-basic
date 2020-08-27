package com.zhichen.day4.demo05MapTest;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-13 10:47
 *
 * 需求：计算一个字符串中每个字符出现的次数
 *
 * 分析：
 *      1获取一个字符串对象（输入，Scanner sc，sc.next（）)
 *      2字符串.toChar[]
 *      3创建Map集合，键-字母，值-次数，判断键是否存在，不存在就加入，存在就次数+1
 */
public class Description {
    public static void main(String[] args) {
        System.out.println("请输入一个字符串：");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
//        System.out.println(str);

        char[] chars = str.toCharArray();
//        System.out.println(chars);

        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if(!map.containsKey(chars[i])){
                map.put(chars[i],1);
            }else{
                map.put(chars[i],map.get(chars[i])+1);
            }
        }

        Set<Character> characters = map.keySet();
        for (Character character : characters) {
            System.out.println(character+"出现次数："+map.get(character));
        }
    }
}

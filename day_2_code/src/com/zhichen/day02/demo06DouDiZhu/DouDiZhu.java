package com.zhichen.day02.demo06DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-11 10:19
 */
public class DouDiZhu {
    public static void main(String[] args) {
        //1.准备牌
        //定义一个存储54张牌的ArrayList<String>
        ArrayList<String> poker = new ArrayList<>();
        //定义两个数组，一个存储花色，一个存储数字
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        //先加入大小王
        poker.add("大王");
        poker.add("小王");
        for (String num : nums) {
            for (String color : colors) {
//                System.out.println(color+num);
                poker.add(color + num);
            }
        }
//        System.out.println(poker);

        //2.洗牌
        //使用集合类Collections中的方法
        //static void shuffle(List<?> list)使用默认随机源对指定列表进行置换
        Collections.shuffle(poker);
//        System.out.println(poker);

        //3发牌
        //定义四个集合，存储三位玩家的牌和底牌
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> bottom = new ArrayList<>();
        //遍历poker集合，使用poker集合的索引%取模3，给三个玩家发牌
        //i>=51时停止发牌留作底牌
        for (int i = 0; i < poker.size(); i++) {
            String p = poker.get(i);

            if (i >= 51) {
                bottom.add(p);
            }else if(i%3==0){
                player01.add(p);
            }else if(i%3==1){
                player02.add(p);

            }else if(i%3==2){
                player03.add(p);
            }

        }

        //4看牌
        System.out.println("玩家一："+player01);
        System.out.println("玩家二："+player02);
        System.out.println("玩家三："+player03);
        System.out.println("底牌"+bottom);
    }
}

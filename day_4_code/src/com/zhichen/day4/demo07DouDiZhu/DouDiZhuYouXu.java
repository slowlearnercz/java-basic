package com.zhichen.day4.demo07DouDiZhu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-15 10:18
 */
public class DouDiZhuYouXu {
    public static void main(String[] args) {
        //1备牌
        //创建map，存储牌的索引和组装好的牌
        HashMap<Integer, String> poker = new HashMap<>();
        //创建一个list，存储牌的索引
        ArrayList<Integer> pokerIndex = new ArrayList<>();
        //备4*13张牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        int index = 0;
        //存入大小王
        poker.put(index,"大王");
        pokerIndex.add(index);
        index++;
        poker.put(index,"小王");
        pokerIndex.add(index);
        index++;
        //循环嵌套遍历,组装52张牌
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index,color+num);
                pokerIndex.add(index);
                index++;
            }
        }
        System.out.println(poker);
        System.out.println(pokerIndex);


        //2洗牌  洗牌通过pokerIndex去实现，再通过索引值去poker所指的map中去取牌
        Collections.shuffle(pokerIndex);
        ArrayList<Integer> player01Index = new ArrayList<>();
        ArrayList<Integer> player02Index = new ArrayList<>();
        ArrayList<Integer> player03Index = new ArrayList<>();
        ArrayList<Integer> bottomIndex = new ArrayList<>();
        for (int i = 0; i < pokerIndex.size(); i++) {
            if(i>=51){
                bottomIndex.add(pokerIndex.get(i));
            }else if(i%3==0){
                player01Index.add(pokerIndex.get(i));
            }else if(i%3==1){
                player02Index.add(pokerIndex.get(i));
            }else if(i%3==2){
                player03Index.add(pokerIndex.get(i));
            }
        }

        //3把每份发到手的牌进行排序
        Collections.sort(player01Index);
        Collections.sort(player02Index);
        Collections.sort(player03Index);
        Collections.sort(bottomIndex);
//        System.out.println(player01Index);
//        System.out.println(player02Index);
//        System.out.println(player03Index);
//        System.out.println(bottomIndex);

        //4找map取牌
        //定义一个看牌的方法，提高代码的复用性
        /* 参数：String name:玩家名称
                HashMap<Integer,String> poker:牌集合
                ArrayList<Integer> list:存储玩家和底牌索引的集合
           查表法:
                遍历玩家和底牌索引集合
                使用牌索引，去map集合找牌
        */
        seePoker("player01",poker,player01Index);
        seePoker("player02",poker,player02Index);
        seePoker("player03",poker,player03Index);
        seePoker("底牌",poker,bottomIndex);
    }
    public static void seePoker(String name, HashMap<Integer,String> poker, ArrayList<Integer> list){
        System.out.print(name+":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}

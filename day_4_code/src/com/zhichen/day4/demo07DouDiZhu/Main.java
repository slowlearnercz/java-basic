package com.zhichen.day4.demo07DouDiZhu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-15 9:37
 *
 * 此版本为第一版的斗地主复习练手代码
 */
public class Main {
    public static void main(String[] args) {
        //用Collection组合牌
        String[] colors = {"♠", "♥", "♣", "♦"};
        String[] nums = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        Collection<String> poker = new ArrayList<>();
        poker.add("大王");
        poker.add("小王");
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                poker.add(colors[i]+nums[j]);
            }
        }
//        System.out.println(poker);

        //洗牌
        Collections.shuffle((List<?>) poker);
//        System.out.println(poker);

        //发牌
        Collection<String> player01= new ArrayList<>();
        Collection<String> player02= new ArrayList<>();
        Collection<String> player03= new ArrayList<>();
        Collection<String> bottom= new ArrayList<>();
        for (int i = 0; i < poker.size(); i++) {
            if (i >= 51) {
                bottom.add(((ArrayList<String>) poker).get(i));
            } else if (i % 3 == 0) {
                player01.add(((ArrayList<String>) poker).get(i));
            } else if (i % 3 == 1) {
                player02.add(((ArrayList<String>) poker).get(i));
            } else if (i % 3 == 2) {
                player03.add(((ArrayList<String>) poker).get(i));

            }
        }
        //看牌
        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);
        System.out.println(bottom);
    }
}

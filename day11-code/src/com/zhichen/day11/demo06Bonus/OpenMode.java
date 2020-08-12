package com.zhichen.day11.demo06Bonus;

import java.util.ArrayList;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 10:55
 * totalMoney分成count份，保存到ArrayList<Integer>中，并将其返回
 */
public interface OpenMode {
    ArrayList<Integer> divide(int totalMoney, int totalCount);
}

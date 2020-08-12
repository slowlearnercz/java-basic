package com.zhichen.day11.demo06Bonus;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 10:54
 *
 * 场景说明：拼手气抢红包，所有人都有红包拿，大家抢完之后，最后一个红包给群主
 *
 * 红包分发策略
 *  1普通红包  totalMoney/totalCount,除不尽的余数放在最后一个红包中
 *  2手气红包(随机) 最少1分钱，最多不超过平均数的2倍，而且越发越少
 */
public class BonusDrive {
    public static void main(String[] args) {
        Myred red = new Myred("红包王");
    }
}

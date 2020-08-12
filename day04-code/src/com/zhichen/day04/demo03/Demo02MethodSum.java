package com.zhichen.day04.demo03;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-06-30 9:37
 */
public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(AddNum());
    }
    public static int AddNum(){
        int sum=0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }
}

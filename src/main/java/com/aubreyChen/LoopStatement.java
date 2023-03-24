package com.aubreyChen;

public class LoopStatement {
    public static void main(String[] args) {
        // while循环：先判断，再执行。
        int i = 0;
        while (i < 0){
            System.out.println(1);
            i ++ ;
        }
        // do-while循环：先执行，再判断，至少执行一次。
        int j = 0;
        do {
            System.out.println(2);
            j ++ ;
        } while(j < 0);
        // for 循环
        for (int k = 0; k < 5; k ++ ) {
            System.out.println(k);
        }
        // foreach遍历
        int[] a = {0, 1, 2, 3, 4};
        for (int x : a) {
            System.out.println(x);
        }
        String[] strs = {"I", "MISS", "YOU"};
        for (String str : strs) {
            System.out.printf("%s ", str);
        }
    }
}

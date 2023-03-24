package com.aubreyChen;

import java.util.Scanner;

public class JudgmentStatement {
    public static void main(String[] args){
        // 判断闰年
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
//        if (year % 100 == 0) {
//            if (year % 400 == 0)
//                System.out.printf("%d 是闰年！", year);
//            else
//                System.out.printf("%d 不是闰年！", year);
//        } else {
//            if (year % 4 == 0)
//                System.out.printf("%d 是闰年！", year);
//            else
//                System.out.printf("%d 不是闰年！", year);
//        }
        if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
            System.out.printf("%d 是闰年！", year);
        else
            System.out.printf("%d 不是闰年！", year);

        // 输出数字对应星期的英文单词
        int day = sc.nextInt();
        String name;

        switch (day) {
            case 1:
                name = "Monday";
                break;
            case 2:
                name = "Tuesday";
                break;
            case 3:
                name = "Wednesday";
                break;
            case 4:
                name = "Thursday";
                break;
            case 5:
                name = "Friday";
                break;
            case 6:
                name = "Saturday";
                break;
            case 7:
                name = "Sunday";
                break;
            default:
                name = "Invalid";
        }
        System.out.printf("%s", name);
    }
}

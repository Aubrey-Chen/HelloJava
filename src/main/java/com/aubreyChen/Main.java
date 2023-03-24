package com.aubreyChen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // 内置数据类型
//        byte a = 123;  // 有符号字节整数范围：-128 ~ 127
//        short b = 12345;  //二字节有符号整数范围：-32768 ~ 32767
//        int c = 123456789;  // 32位有符号整数范围：-2147483648 ~ 2147483647
//        long d = 1234567891011L;  // 八字节整型：-2^63 ~ 2^63 - 1，常量类型的long数字后面要加上L
//        float e = 1.2F;  // 单精度浮点数：直接写1.2所有小数都是double，若想定义一个常量的float类型，小数后要加上F
//        double f = 1.2, g = 1.2D;  // 双精度浮点数
//        boolean h = false;  // 布尔类型
        // C++里的常量定义用const，Java里的常量定义用final
//        final char s = 'A';  // 字符型：char在Java里是2个字节，在C/C++里是1个字节

        // 显示地类型转换
//        char c = 'A';
//        int x = (int)c;
        // 隐式地类型转换：低精度可以转换为高精度
//        int y = 12;
//        double z = y;
//        double a = 4 * 3.3;
        // 强制类型转换：可以将高精度的转化为低精度的
//        int b = (int) (4 * 3.3);
//        System.out.println(x);
//        System.out.println(b);
        // 输入
        // 方式1，效率较低，输入规模较小时使用。
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
////        int x = sc.nextInt();  // 读入下一个整数
////        float y = sc.nextFloat();  // 读入下一个单精度浮点数
////        double z = sc.nextDouble();  // 读入下一个双精度浮点数
////        String line = sc.nextLine();  // 读入下一行
//        System.out.println(str);

        // 方式2，效率较高，输入规模较大时使用。注意需要抛异常。（用Java写算法题时，输入操作必用BufferedReader来实现）
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        int a= br.read();  // 读入一个字符的ASCII码
//        System.out.println(str);
//        System.out.println(a);

        // 用BufferedReader读入一个整型的方法
        // 当输入一个整型时
        int x = Integer.parseInt(br.readLine());  // Integer.parseInt()可以收入一个字符串，并把字符串转换为整型
        // 当输入多个用空格隔开的整型时
        // 将读入的一行字符串，去除掉两个字符间的一个空格后，再分别存储到字符串数组strs里
        String[] strs = br.readLine().split(" ");
        int y = Integer.parseInt(strs[0]), z = Integer.parseInt(strs[1]);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // 输出
        // 方式1，效率较低，输入规模较小时使用。
//        System.out.print("Hello World！");  // 输出末尾自动添加换行符
//        System.out.println(123);  // 不换行输出
//        // C++里用%lf表示double，用%f表示float；Java里用%f表示浮点数（不管是double还是float）。
//        System.out.printf("%.2f %04d\n", 3.1415926535, 10);  // 相当于C里的printf格式化输出，%04d表示不足四位的话前面补零

        // 方式2，效率较高，输入规模较大时使用。注意需要抛异常。（用Java写算法题时，输出操作可用BufferedWriter来优化）
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write("Hello World\n");
        bw.flush();  // 需要手动刷新缓冲区
    }
}
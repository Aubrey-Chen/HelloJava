package com.aubreyChen;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // C++中定义：int a[5];
        // Java中new的数组会默认将数字数组初始化0 / 0.0 / ···，字符数组初始化为空字符串。
        // C++中是可以用字符数组来表示字符串的char c[] = "abc";
        // Java中字符数组就是字符数组，字符串就是String，两者是相互独立的。
//        int[] a = new int[5];  // 表示初始化一个长度为5的数组a
//        int n = 10;
//        float[] b = new float[n];  // 用变量n来表示初始长度
//        // 用初值来初始化数组
//        char[] c = {'a', 'b', 'c'};  // 初始化一个长度为3的字符数组，第1、2、3个元素分别为a、b、c
//        char[] d = c;  // 表示数组d和数组c是同一个数组，赋的是一个引用，在内存里面其实是同一个地址
//        d[1] = 'x';  // 数组里存的是引用，两个数组指向的是同一个地址，引用是一样的。其中一个数组改变，另一个数组也会随之改变。
//        System.out.println(c.hashCode());
//        System.out.println(c[1]);
//        System.out.println(d.hashCode());
//        System.out.println(d[1]);

        // 数组的读取与写入
//        int[] a = new int[5];
//        for (int i = 0; i < 5; i ++ )
//            a[i] = i;

//        for (int i = 0; i < 5; i ++ )
//            System.out.println(a[i] * a[i]);

        // 多维数组
        // Python里提供一个函数可以直接将数组a变成一个字符串来输出：Arrays.toString(a)，但只能输出一维的信息。
        // Python里也提供一个可以深度输出多维数组的方法：Arrays.deepToString(a)，会递归去把每一个地址都给解析出来。
        int[][] arr = new int[2][3];  // 定义一个2行3列的二维数组
        arr[1][2] = 3;
        // 初始化多维数组
        int[][] brr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.deepToString(arr));
        System.out.println(Arrays.deepToString(brr));

        //   常用API:
        // · 属性length：返回数组长度，注意不加小括号（Java里数组的length是一个属性，字符串的length()是一个方法）
        // · Arrays.sort()：数组排序
        // · Arrays.fill(int[] a, int val)：填充数组
        // · Arrays.toString()：将数组转化为字符串
        // · Arrays.deepToString()：将多维数组转化为字符串
        // · 数组不可变长
//        int[] a = new int[10];
//
//        for (int i = 0; i < a.length; i ++ ) {
//            a[i] = 10;
//        }
        Integer[] a = {2, 1, 5, 3, 4};
        // 数组正序排序
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        // 数组倒序排序（自定义函数只支持对象，因为Arrays.sort()不支持基本类型，他需要用对象来存。像只能用Integer不能用int）
        Arrays.sort(a, (x, y) -> y - x);
        System.out.println(Arrays.toString(a));

        // 赋值填充数组
        Arrays.fill(a, 100);
        System.out.println(Arrays.toString(a));

    }
}

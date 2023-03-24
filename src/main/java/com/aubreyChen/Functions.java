package com.aubreyChen;

import java.util.Arrays;
import java.util.Scanner;

// 静态函数里只能够调用静态变量或静态函数
// 静态static修饰的变量或函数，类似于全局变量，所有函数共用的。
// 普通的不加static修饰的变量或函数，相当于每一个实例都有自己的一份，复制一份。

// Java里不能定义全局变量。但可以定义一个类，作为全局变量，这个类可以继承一些常数。
class Argument {
    public final static int x = 1;
    public final static int y = 1;
}

class Nodes {
    // Point --> y
    // _ _ | _ _
    // a   b   c
    // x   x   x
    private int x;
    private static int y;

    // 没有加static的函数，是绑定在每一个具体的对象上的(node)
    public int f() {
        return 0;
    }
    // 加static的静态函数，是绑定在类上的(Node)
    public static int g() {  // static修饰的函数，类的每个实例共用这个函数
        return 0;
    }
}

// public是指类外面所有位置都可以访问，private是指只有这个类自己可以访问，类外面不能访问。
public class Functions {
    public static void main(String[] args) {
        Nodes.g();  // 如果函数有加static修饰的话，调用时用“类名.方法名”的方法调用
        Nodes nodes = new Nodes();

        nodes.f();  // 如果想调用非static具体的函数的话，要用它的某个实例来调用。


        // 静态变量或静态函数访问时,是用类名来访问。静态变量是绑定到类上面的。
        // 普通变量或普通函数访问时，是用具体的实例来访问。普通变量是绑定到具体的实例上面的。
        System.out.println(Argument.x);

        int[][] a = new int[3][4];
        fill(a, 3);
        System.out.println(Arrays.deepToString(a));

        int[][] arr = getArray2d(3, 4, 10);
        System.out.println(Arrays.deepToString(arr));

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(), y = sc.nextInt();
        System.out.println(max(x, y));
    }

    private static int max(int a, int b) {
        return Math.max(a, b);
    }

    // 将数组的值初始化为val
    private static void fill(int[][] a, int val) {
        for (int i = 0; i < a.length; i ++ )
            for (int j = 0; j < a[i].length; j ++ )
                a[i][j] = val;
    }

    // 创建一个row行col列的二维数组并初始化为val
    private static int[][] getArray2d(int row, int col, int val) {
        int[][] res = new int[row][col];
        for (int i = 0; i < row; i ++ )
            for (int j = 0; j < col; j ++ )
                res[i][j] = val;
        return res;
    }
}

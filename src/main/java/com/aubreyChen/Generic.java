package com.aubreyChen;

import java.util.Stack;

// 类似于C++的template，Java的类和接口也可以定义泛型，即同一套函数可以作用于不同的对象类型。
public class Generic {
    public static void main(String[] args) {
        // 泛型只能使用对象类型，不能使用基本变量类型。
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println("pop: " + stk.pop());
        System.out.println("peek: " + stk.peek());
        for (Integer x : stk) {
            System.out.printf("%d ", x);
        }
    }
}

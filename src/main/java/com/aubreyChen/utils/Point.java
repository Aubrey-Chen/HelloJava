package com.aubreyChen.utils;

public class Point {
    // 成员变量x, y
    private int x;
    private int y;

    // 构造函数：可在初始化时赋值。构造函数一般是用于初始化的。
    public Point(int x, int y) {
        // this是类的成员函数想访问自己成员变量的一个引用
        // 访问成员变量的方式：this.成员变量名
        this.x = x;
        this.y = y;
    }
    // get的作用是查询
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    // set的作用是修改
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        // format功能跟printf的功能相似。
        // printf()是把格式化内容输出到标准输出里面；String.format()是输出到一个String里面

        return String.format("(%d, %d)", x, y);
    }
}
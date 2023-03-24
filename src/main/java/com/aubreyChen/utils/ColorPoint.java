package com.aubreyChen.utils;

// 同一个目录下不需要import，所以在子类ColorPoint里是不需要import父类Point的。
public class ColorPoint extends Point {
    private String color;

    public ColorPoint(int x, int y, String color) {
        // super用来调用父类的构造函数，需传入父类构造函数的两个参数
        super(x, y);
        this.color = color;  // 将当前的私有变量color初始化
    }

    public String getColor() {
        return color;  // 取值
    }
    public void setColor(String color) {
        this.color = color;  // 赋值
    }

    // 子类重写的toSting()函数，会覆盖掉父类重写的toString()函数
    public String toString() {
        // return String.format("(%d, %d, %s)", x, y, color);  // 子类继承父类时，也不难直接访问父类的私有成员变量
        // 要想访问父类私有成员变量，应用父类的super引用：super.getX()函数访问
        return String.format("(%d, %d, %s)", super.getX(), super.getY(), color);
    }
}


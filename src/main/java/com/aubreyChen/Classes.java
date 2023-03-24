package com.aubreyChen;

import com.aubreyChen.utils.Point;
import com.aubreyChen.utils.ColorPoint;

// 继承：继承的类的实例可以访问父类的函数
// 一个变量如果是子类ColorPoint类型，那么他也必然是父类Point类型
public class Classes {
    public static void main(String[] args) {
        // new的实质其实就是调用了构造器（构造方法）
        Point point = new Point(3, 4);

        point.setX(5);
        point.setY(10);

        System.out.println(point.toString());

        // 继承：
        // 子类的对象colorPoint是可以放到父类的引用上的。
//        ColorPoint colorPoint = new ColorPoint(3, 4, "RED");
        Point colorPoint = new ColorPoint(3, 4, "RED");
        System.out.println(colorPoint.toString());  // 调用ColorPoint子类重写的toString()函数
        // 子类的实例colorPoint可以调用Point父类的setX() / getX()等函数
        colorPoint.setX(10);
        System.out.println(colorPoint.getX());

        // 多态：实现 “同一个类的同一个函数具有不同的行为(调用不同类的函数)”
        Point a = new Point(3, 4);
        System.out.println(a.toString());

        a = new ColorPoint(4, 5, "GREEN");
        System.out.println(a.toString());
    }
}
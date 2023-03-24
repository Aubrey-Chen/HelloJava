package com.aubreyChen;

import java.sql.SQLOutput;
import java.util.Scanner;

// interface与class类似。主要用来定义类中所需包含的函数。接口像一个基类，是用来规范某些类必须要实现的一些函数的作用，不能用来实例化。
// 接口也可以继承其他接口，一个类可以实现多个接口。
interface Role {
    public void greet();
    public void move();
    public int getSpeed();
}

interface Role2 {

}

interface Hero extends Role, Role2 {
    public void attack();
}

// Tips："Alt + Enter"可以一键实现所有接口的方法
class Zeus implements Hero {
    private final String name = "Zeus";

    public void greet() {
        System.out.println(name + ": Hi!");
    }

    public void move() {
        System.out.println(name + ": Move!");
    }

    public int getSpeed() {
        return 10;
    }

    public void attack() {
        System.out.println(name + ": Attack!");
    }
}

class Athena implements Hero{
    private final String name = "Athena";

    public void greet() {
        System.out.println(name + ": Hello!");
    }

    public void move() {
        System.out.println(name + ": Move!");
    }

    public int getSpeed() {
        return 17;
    }

    public void attack() {
        System.out.println(name + ": Attack!");
    }
}

// 接口是可以继承多个接口的。
// 类是可以实现多个接口的，但是类只能继承一个类。
public class Interfaces {
    public static void main(String[] args) {
        // 一旦一个类实现了某个接口，他就可以把这个类的对象放到这个接口的引用上。
//        Zeus zeus = new Zeus();
        Hero zeus = new Zeus();
//        zeus.greet();
//        zeus.move();
//        zeus.getSpeed();
//        zeus.attack();

        // 接口的多态
        Hero[] heros = {new Zeus(), new Athena()};
        for (Hero hero: heros) {
            hero.greet();
        }
        // 接口多态的应用：英雄的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Choose Your Hero: ");
        String name = sc.next();
        Hero hero;

        if ("Zeus".equals(name)) {
            hero = new Zeus();
        } else {
            hero = new Athena();
        }

        hero.greet();
        hero.move();
        hero.attack();

    }
}

package com.aubreyChen;

// 链表的声明
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class LinkedLists {
    public static void main(String[] args) {
        // 链表的实现
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        // 链表的遍历
        for (Node p = head; p != null; p = p.next) {
            System.out.printf("%d ", p.val);
        }
    }
}

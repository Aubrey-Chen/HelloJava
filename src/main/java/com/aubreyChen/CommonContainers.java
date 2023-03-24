package com.aubreyChen;

import java.util.*;

// Java里的栈是一个类，队列、链表是一个接口。
public class CommonContainers {
    public static void main(String[] args) {
        // 若有大量的随即寻址操作，则用ArrayList；若有大量中间的添加删除操作，则用LinkedList。
        List<Integer> list = new ArrayList<>();
        list.add(1);  // 在末尾添加一个元素
        list.add(2);
//        list.clear();  // 清空
        System.out.println(list);
        System.out.println(list.size());  // 返回长度
        System.out.println(list.isEmpty());  // 判断是否为空
        System.out.println(list.get(0));  // 获取第i个元素
        list.set(0, 5);  // 将第i个元素设置为val
        System.out.println(list);
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // Java里栈是一个类
        Stack<Integer> stk = new Stack<>();
        stk.push(1);  // 压入元素
        stk.push(2);
        System.out.println(stk);
        System.out.println(stk.peek());  // 返回栈顶元素
        System.out.println(stk.pop());  // 弹出栈顶元素，并返回栈顶元素
        System.out.println(stk.empty());  // 判断栈是否为空
//        stk.clear();  // 清空
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // Java里队列是一个接口
        Queue<Integer> q = new LinkedList<>();  // 双链表
        q.add(1);  // 在队尾添加元素
        q.add(2);
        System.out.println(q);
        System.out.println(q.peek());  // 返回队头
        q.remove();  // 删除队头
        System.out.println(q);
        System.out.println(q.isEmpty());  // 判断队列是否为空
        System.out.println(q.size());  // 返回长度
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // 优先队列默认实现的是小根堆，大根堆写法：new PriorityQueue<>(Collections.reverseOrder()) 或 new PriorityQueue<>((a, b) -> b - a)
        Queue<Integer> heap = new PriorityQueue<>();  // 优先队列
        heap.add(5);
        heap.add(3);
        heap.add(4);
        System.out.println(heap.peek());  // 返回队头：小根堆的堆头
        heap.remove();  // 删除队头元素
        System.out.println(heap.peek());

//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // Set是一个集合，维护的是一个值的
        // HashSet：哈希表 — — 无序集合
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(1);  // HashSet会把重复的去掉
        System.out.println(hashSet);
        System.out.println(hashSet.contains(3));  // 判断是否包含某个元素
        System.out.println(hashSet.isEmpty());  // 判断哈希表是否为空
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // TreeSet：平衡树 — — 有序集合 — — 时间复杂的多一个log(N)。
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        // 返回大于等于key的最小元素，不存在则返回null
        System.out.println(treeSet.ceiling(4));
        // 返回小于等于key的最大元素，不存在则返回null
        System.out.println(treeSet.floor(1));
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // Map是一个集合的映射，维护的是一个键值对的
        // HashMap：哈希表，无序的
        Map<Integer, String> hashMap = new HashMap<>();
        // 添加关键字和其对应的值
        hashMap.put(2, "abc");
        hashMap.put(5, "yxc");
        hashMap.put(7, "AcWing");
        // 返回关键字对应的值
        System.out.println(hashMap.get(5));
        // 是否包含关键字
        System.out.println(hashMap.containsKey(5));
        // 删除关键字
        hashMap.remove(2);
        System.out.println(hashMap);
        // 返回元素数
        System.out.println(hashMap.size());
        // 判断哈希表是否为空
        System.out.println(hashMap.isEmpty());

        // 获取Map中所有键值对对象的集合
        System.out.println(hashMap.entrySet());

        // 遍历Map中的对象类型
        for (Map.Entry<Integer, String> p : hashMap.entrySet()) {
            System.out.printf("%d ", p.getKey());
            System.out.println(p.getValue());
        }
        System.out.println("");
//  —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— —— ——
        // TreeMap：平衡树，有序的
        // 支持二分法，有额外操作
        TreeMap treeMap = new TreeMap<>();
        treeMap.put(2, "QAQ");
        treeMap.put(5, "Aubrey");
        treeMap.put(7, "Chen");

        // 返回大于等于key的最小元素，不存在则返回null
        Map.Entry<Integer, String> up = treeMap.ceilingEntry(4);
        System.out.printf("%d %s\n", up.getKey(), up.getValue());

        // 返回小于等于key的最大元素，不存在则返回null
        Map.Entry<Integer, String> down = treeMap.floorEntry(4);
        System.out.printf("%d %s\n", down.getKey(), down.getValue());
    }
}
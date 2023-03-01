package com.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.DelayQueue;

/**
 * @author xhy
 * @date 2022/7/21 22:43
 * 双端对列
 */
public class DequeDemo {

    public static void main(String[] args) {
        /**
         * public interface Deque<E> extends Queue<E>
         * 继承了Queue的所有属性
         * 其实LinkList就是实现了Deque
         */
        Deque<String> deque = new LinkedList();
        deque.offer("B");
        deque.offer("C");
        System.out.println(deque);

        deque.offerFirst("A");
        deque.offerLast("D");
        System.out.println(deque);

        System.out.println(deque.pollFirst());
        System.out.println(deque.pollLast());
        System.out.println(deque);

    }
}

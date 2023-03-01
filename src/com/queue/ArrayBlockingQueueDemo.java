package com.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author xhy
 * @date 2022/7/21 23:07
 */
public class ArrayBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<String>(3);
        queue.add(null); //报错
        queue.offer(null); //报错
        queue.put(null); //报错

        queue.add("aaa");
        queue.offer("bbb");
        queue.put("ccc");

        queue.add("dd");//在队列满的情况下报错
        queue.offer("dd");//在队列满的情况下,抛弃
        queue.offer("dd",2, TimeUnit.SECONDS);//设置最大的阻塞时间,如果时间到达,队列还是阻塞的话就返回失败
        queue.put("dd");//在队列满的情况下,等待

        queue.peek();//获取元素,不抛弃元素
        queue.poll();//获取元素,抛弃元素,如果队列为空,返回null
        queue.take();//获取元素,并且抛弃元素.如果队列为空,一直等到获取

    }
}

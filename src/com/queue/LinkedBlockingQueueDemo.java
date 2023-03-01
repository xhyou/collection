package com.queue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author xhy
 * @date 2022/7/26 19:44
 */
public class LinkedBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        linkedBlockingQueue.put("add");
        linkedBlockingQueue.put("del");
        linkedBlockingQueue.poll();
    }
}

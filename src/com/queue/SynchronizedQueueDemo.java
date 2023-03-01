package com.queue;

import java.util.Objects;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author xhy
 * @date 2022/7/26 20:32
 */
public class SynchronizedQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        //方便线程间的数据传送
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        new Thread(()->{
            while (true){
                try {
                    Object result = synchronousQueue.poll(5, TimeUnit.SECONDS);
                    System.out.println(result);
                    if(Objects.isNull(result)) break;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(()->{
                try {
                    synchronousQueue.put("aaa");
                    synchronousQueue.put("bbb");
                    synchronousQueue.put("ccc");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
        }).start();
    }
}

package com.queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author xhy
 * @date 2022/7/21 22:09
 */
public class User implements Delayed {
    private int id;
    private String name;
    private long endTime;

    public User(int id, String name, long endTime) {
        this.id = id;
        this.name = name;
        this.endTime = endTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }


    /**
     * 判断剩余时间是否小于等于0
     * @param unit
     * @return
     */
    @Override
    public long getDelay(TimeUnit unit) {
        return this.getEndTime()-System.currentTimeMillis();
    }

    @Override
    public int compareTo(Delayed o) {
        //比较队列数据 到期时间的比较
        User other = (User) o;
        return ((Long)this.getEndTime()).compareTo(other.getEndTime());
    }
}

package com.queue;

import java.util.concurrent.DelayQueue;

/**
 * @author xhy
 * @date 2022/7/21 22:09
 */
public class DelayQueueDemo {
    DelayQueue<User> dq = new DelayQueue<>();

    //登录游戏
    public void login(User user) {
        dq.put(user);
        System.out.println("用户:[" + user.getId() + "],[" + user.getName() + "]已经登录,预计下机时间为:" + user.getEndTime());
    }

    //时间到,退出游戏,从队列中移除
    public void loginOut() {
        //打印队列
        System.out.println(dq);
        try {
            User user = dq.take();
            System.out.println("用户:[" + user.getId() + "],[" + user.getName() + "]上机时间到,退出游戏");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public int onLineSize() {
        return dq.size();
    }


    public static void main(String[] args) {
        DelayQueueDemo delayQueueDemo = new DelayQueueDemo();
        delayQueueDemo.login(new User(1, "张三", System.currentTimeMillis() + 5));
        delayQueueDemo.login(new User(2, "李四", System.currentTimeMillis() + 10));
        delayQueueDemo.login(new User(3, "王五", System.currentTimeMillis() + 15));
        while (true) {
            delayQueueDemo.loginOut();
            if (delayQueueDemo.onLineSize() == 0) {
                System.out.println("当前所有机器空闲...");
                break;
            }
        }
    }

}

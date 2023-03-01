package com.map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author xhy
 * @date 2022/6/29 22:36
 * hashMap源码解析
 */
public class HashMapDemo {

    public static void main(String[] args) {
        Collection ac = new ArrayBlockingQueue(3);
        ac.add("1");
        ac.add("1");
        ac.add("1");
        ac.add("1");
    }

}

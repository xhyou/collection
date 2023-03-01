package com.map;

import java.util.*;

/**
 * @author xhy
 * @date 2022/7/4 21:33
 */
public class TreeMapDemo {
    public static void main(String[] args) {
        List<String>  oldList = new ArrayList<>();
        //源码解析
        List<String> list = Collections.synchronizedList(oldList);
    }
}

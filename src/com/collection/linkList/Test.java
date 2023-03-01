package com.collection.linkList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author xhy
 * @date 2022/6/20 22:05
 */
public class Test {
    public static void main(String[] args) {
        List<String> linkList = new LinkedList<>();
        linkList.add("aaa");
        for (Iterator<String> iterator = linkList.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}

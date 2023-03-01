package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xhy
 * @date 2022/6/17 22:30
 */
public class TestGeneric<E> {

    //不是泛型方法
    public void testB(E e){

    }

    //是泛型方法
    //要求方法泛型的参数类型要和当前类的泛型无关
    //泛型方法定义的时候,前面要加<T> 如果不加的话,会把T当做一种数据类型
    //然而代码中没有T类型就会报错
    //注意泛型方法可以是是静态方法
    public static <T> void testA(T t){

    }


    //
    public void testC(){
        Object object = new Object();
        String s = new String();
        object = s ;

        Object[] objectArray = new Object[10];
        String[] strings = new String[10];
        objectArray = strings;

        List<Object> objectList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();
        //无法转换,因为底层都是Object[] e数组,它们是平级的
//        objectList = stringList;
    }


}


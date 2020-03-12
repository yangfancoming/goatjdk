package com.goat.jdk.learn.chapter008.A06.map;

import org.junit.Test;

import java.util.*;

/**
 * Created by 64274 on 2019/7/28.
 *
 * @ Description: 各种集合key，value能否为null
 * @ author  山羊来了
 * @ date 2019/7/28---16:40
 */
public abstract class MapBase {

    Map<String,String> map = new HashMap<>();
    Map<String,String> map1 = new HashMap<>();
    Map<Integer,String> map2 = new HashMap<>();
    List<Map<String,String>> map4 = new ArrayList<>();
    List<Map<String,String>> map5 = new ArrayList<>();


    /**
     * HashMap
     * key只能有一个为null，多个key=null的会覆盖，value可以多个为null
    */
    @Test
    public void test1(){
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, null);
        map.put(1, 111);
        map.put(2, null);
        map.put(null, 1);
        map.put(null, 2);
        System.out.println(map);//{null=2, 1=null, 2=null}
    }


    /**
     * Hashtable 和 ConcurrentHashMap
     * key，value都不能为null
     */
    @Test
    public void test2(){
        Hashtable<Integer, Integer> map = new Hashtable<>();
//        ConcurrentHashMap<Integer, Integer> map = new ConcurrentHashMap<>();
        map.put(1, null);
        map.put(2, null);
        map.put(null, 1);
        map.put(null, 2);
        System.out.println(map);//
    }


    /**
     *  TreeMap
     * key不能为null，value可以为null
     */
    @Test
    public void test3(){
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(1, null);
        map.put(2, null);
//        map.put(null, 1);
//        map.put(null, 2);
        System.out.println(map);//
    }
}

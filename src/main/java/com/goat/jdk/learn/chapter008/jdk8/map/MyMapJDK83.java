package com.goat.jdk.learn.chapter008.jdk8.map;


import org.junit.Test;

import java.util.*;


/**
 * Created by 64274 on 2018/7/21.
 *
 * @author 山羊来了
 * @Description: jdk8 java8  map computeIfAbsent
 * @date 2018/7/21---18:15
 */
public class MyMapJDK83  {
    Map<String, List<Integer>> conflictingMethods = new HashMap<>();

    @Test
    public void test1(){ //  遍历Map的方式一
        List<Integer> list1 = Arrays.asList(1,1,1);
        conflictingMethods.put("bar",list1);
        gaga(conflictingMethods);
        System.out.println(conflictingMethods);
    }

    public void gaga(Map<String, List<Integer>> map){
        List<Integer> list = map.computeIfAbsent("foo", k -> new ArrayList<>());
        // 这里需要注意：add 操作的是已经put到 conflictingMethods Map集合中的list 并不是多余操作
//        list.add(4);
        System.out.println(list);
    }


}

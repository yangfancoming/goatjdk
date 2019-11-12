package com.goat.jdk.learn.chapter009.A001.item01;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: 泛型类
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    /**
    */
    @Test
    public void test1(){
        Container<String, String> c1 = new Container<>("name", "findingsea");
        Container<String, Integer> c2 = new Container<>("age", 24);
        Container<Double, Double> c3 = new Container<>(1.1, 2.2);
        System.out.println(c1.getKey() + " : " + c1.getValue());
        System.out.println(c2.getKey() + " : " + c2.getValue());
        System.out.println(c3.getKey() + " : " + c3.getValue());
    }

    /**
     */
    @Test
    public void test2(){

    }
}

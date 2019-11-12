package com.goat.jdk.learn.chapter009.B001.item01;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: 泛型接口
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    /**
    */
    @Test
    public void test1(){
        FruitGenerator generator = new FruitGenerator();
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
        System.out.println(generator.next());
    }

    /**
     */
    @Test
    public void test2(){

    }
}

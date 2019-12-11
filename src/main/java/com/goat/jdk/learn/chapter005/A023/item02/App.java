package com.goat.jdk.learn.chapter005.A023.item02;

import org.junit.Test;

/**
 * Created by Administrator on 2019/12/11.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/11---9:43
 */
public class App {

    // 两个类中的map 互不影响的
    @Test
    public void test(){
        Demo1 demo1 = new Demo1();
        Demo2 demo2 = new Demo2();
        System.out.println(demo1);
        System.out.println(demo2);
    }



    // 两个类中的map 互不影响的
    @Test
    public void test2(){
        Demo11 demo12 = new Demo11();
        Demo22 demo22 = new Demo22();
        System.out.println(demo12);
        System.out.println(demo22);

        System.out.println(Demo11.map);
        System.out.println(Demo22.map);
    }
}

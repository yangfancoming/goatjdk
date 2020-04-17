package com.goat.jdk.learn.chapter008.jdk8.idefault;

/**
 * Created by Administrator on 2020/4/17.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2020/4/17---9:44
 */
public interface MyInterface {

    default void myMethod() {
        System.out.println("myInterface1");
    }

}
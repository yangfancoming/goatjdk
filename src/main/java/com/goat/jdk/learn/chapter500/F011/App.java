package com.goat.jdk.learn.chapter500.F011;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: 类继承的特点
 * 子类扩展了父类，将可以获得父类的全部成员变量和方法
 * 子类不能获得父类的构造函数
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    /* 测试： 子类扩展了父类，将可以获得父类的全部成员变量和方法 */
    @Test
    public void test(){
        Apple apple = new Apple();
        apple.weight = 100;
        apple.info();
    }
}

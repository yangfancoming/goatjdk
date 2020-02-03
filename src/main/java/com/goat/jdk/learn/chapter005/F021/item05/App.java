package com.goat.jdk.learn.chapter005.F021.item05;

import org.junit.Test;

/**
 * Created by Administrator on 2020/2/1.
 *
 * @ Description: 接口----抽象类---实现类
 * 其中抽象类 可以选择实现接口中的 任意方法，
 * 实现了抽象类的实现类 Impl01  必须直接过间接的实现 接口中的所有方法，(要么自己实现要么是父类抽象类中实现)
 * @ author  山羊来了
 * @ date 2020/2/1---15:49
 */
public class App {

    @Test
    public void test(){
        Impl01 impl01 = new Impl01();
        impl01.test2(2);
        impl01.test1();
    }
}

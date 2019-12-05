package com.goat.jdk.learn.chapter005.F021.item01;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    Ostrich os = new Ostrich();

    /**
     * 在子类中 调用 子类重写父类的方法
     */
    @Test
    public void test(){
        os.fly();
    }

    /**
     * 在子类中 间接调用父类的方法
    */
    @Test
    public void test1(){
        os.callSuper();
    }

    /**
     * 在子类中 直接调用父类的方法
     */
    @Test
    public void test2(){
        os.eat();
    }
}

package com.goat.jdk.learn.chapter005.A030.demo01;

import com.goat.jdk.learn.chapter005.A030.test.People;
import org.junit.Test;

public class App2 extends People{

    /**
     * protected 需要从以下两个点来分析说明：
     * 子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
     * 子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
    */

    @Test
    public void test(){
        People people = new People();
        // 不能访问父类示例的 protected 方法
//        people.study();

        // 可以访问 从父类中继承来的 protected 方法
        this.study();
    }
}

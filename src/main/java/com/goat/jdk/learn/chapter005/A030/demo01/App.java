package com.goat.jdk.learn.chapter005.A030.demo01;

import com.goat.jdk.learn.chapter005.A030.test.People;
import org.junit.Test;

public class App {

    /**
     * private : 在同一类内可见。使用对象：变量、方法。 注意：不能修饰类（外部类）
     *              通常用来修饰成员变量
     * default (即缺省，什么也不写）: 在同一包内可见，不使用任何修饰符。使用对象：类、接口、变量、方法。
     *
     * protected : 对同一包内的类和所有子类可见。使用对象：变量、方法。 注意：不能修饰类（外部类）。
     *              通常用来修饰方法，通常是希望其子类来重写这个方法
     * protected 需要从以下两个点来分析说明：
     * 子类与基类在同一包中：被声明为 protected 的变量、方法和构造器能被同一个包中的任何其他类访问；
     * 子类与基类不在同一包中：那么在子类中，子类实例可以访问其从基类继承而来的 protected 方法，而不能访问基类实例的protected方法。
     *
     * public : 对所有类可见。使用对象：类、接口、变量、方法
    */

    @Test
    public void test(){
        People people = new People();
        people.eat();
//        people.study();
    }
}

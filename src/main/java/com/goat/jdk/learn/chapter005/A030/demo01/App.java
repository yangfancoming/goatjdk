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
     * public : 对所有类可见。使用对象：类、接口、变量、方法
     *
    */

    @Test
    public void test(){
        People people = new People();
        people.eat();
//        people.study();
    }
}

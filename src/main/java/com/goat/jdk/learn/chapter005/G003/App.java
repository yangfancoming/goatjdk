package com.goat.jdk.learn.chapter005.G003;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description:  instanceof 运算符
 * 用于判断前面的对象是否是后面的类，或者是其子类、实现类的实例 如果是则返回true 否则返回false
 * 用途：在进行强制类型转化之前，首先判断前一个对象是否是后一个类的实例，即 是否可以转化成功，从而保证代码的健壮性
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    Object hello = "Hello";

    /**
     *  声明hello时使用Object类，则hello的编译类型是Object，
     *  Object是所有类的父类, 但hello变量的实际类型是String
     *  String与Object类存在继承关系，可以进行instanceof运算
     */
    @Test
    public void test(){
        System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object)); // 返回true
        System.out.println("字符串是否是String类的实例：" + (hello instanceof String)); // 返回true
    }


    /** Math与Object类存在继承关系，可以进行instanceof运算 */
    @Test
    public void test1(){
        System.out.println("字符串是否是Math类的实例：" + (hello instanceof Math));// 返回false
    }


    /** String 实现了Comparable接口，所以返回true */
    @Test
    public void test2(){
        System.out.println("字符串是否是Comparable接口的实例：" + (hello instanceof Comparable));// 返回true
    }

    /**
     * String类与Math类没有继承关系，所以下面代码编译无法通过
     * 报错： Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.Math'
    */
    @Test
    public void test3(){
        String a = "Hello";
//        System.out.println("字符串是否是Math类的实例："+ (a instanceof Math));
    }
}

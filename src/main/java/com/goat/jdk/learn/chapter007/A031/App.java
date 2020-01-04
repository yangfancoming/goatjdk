package com.goat.jdk.learn.chapter007.A031;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2019/12/30.
 *
 * @ Description: Object 常用类
 * @ author  山羊来了
 * @ date 2019/12/30---14:23
 */
public class App {

    Object o1 = new Object();
    Object o2 = new Object();


    /**
     * equals() 与 hashCode()  对比
     * equals()     对比结果绝对可靠    但是对比效率低
     * hashCode()   对比结果绝对不可靠  但是对比效率高
     *
     * 因此，如果有需要大量对比且要求效率的情况下
     * 首先用hashCode()去对比，如果hashCode()不一样，则表示这两个对象肯定不相等（也就是不必再用equal()去再对比了）,
     * 如果hashCode()相同，此时再对比他们的equal()，如果equal()也相同，则表示这两个对象是真的相同了，
     * 这样既能大大提高了效率也保证了对比的绝对正确性！
     */

    // 1. equals() 方法判断两个对象是否为同一个对象
    @Test
    public void equals1(){
        System.out.println(o1.equals(o1));// true
        System.out.println(o1.equals(o2));// false
    }

    // 2.equals() 方法判断 两个类的类型 是否相同  必须是相同类型才返回true 父子类关系也不行
    @Test
    public void equals2(){
        System.out.println( HashMap.class.equals(String.class)); // false
        System.out.println( HashMap.class.equals(Integer.class)); // false
        System.out.println( HashMap.class.equals(Map.class)); // false
        System.out.println( HashMap.class.equals(TreeMap.class)); // false
        System.out.println( HashMap.class.equals(HashMap.class)); // true
        System.out.println( MyTreeMap.class.equals(TreeMap.class)); // false
        System.out.println( MyTreeMap.class.equals(MyTreeMap.class)); // true
    }

    // hashCode() 方法根据该对象的地址来计算，
    @Test
    public void myhashCode(){
        System.out.println(o1.hashCode());//
        System.out.println(o2.hashCode());//
    }




}

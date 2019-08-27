package com.goat.jdk.learn.chapter500.A011;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: 对象的创建
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    @Test
    public void test(){
        // 创建对象  断点调试   强制步入 可以看到 执行到 ClassLoader#loadClass(name, false)
        Person person = new Person();
        System.out.println(person);
    }


    /**
     * 创建对象步骤：
     * 1. 先对该类进行加载 ClassLoader#loadClass(name, false)  （该步骤已经创建对象  但是还没有给成员变量赋值）
     * 2. 找到该类的构造函数  (为了给成员变量赋值)
     * 3. 同一类 只会被加载一次

    */
    @Test
    public void test1(){
        Person p1 = new Person();//  类加载   进入ClassLoader#loadClass(name, false)
        System.out.println(p1);
        Person p2 = new Person();// 这里不再 进入ClassLoader#loadClass(name, false)
        System.out.println(p2);
    }
}

package com.goat.jdk.learn.chapter005.A016;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: 构造函数
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    /**
     * 断点调试 可以看到  代码执行到 new Person();
     * 会进入到 Person 类的构造方法中
     *
     * 构造函数的作用： 不是为了创建对象 因为在执行构造函数之前  就执行了 ClassLoader#loadClass(name, false)  创建了对象
     * 而是为了 给已经创建好的对象 进行初始化操作 (成员属性的赋值)
    */
    @Test
    public void test(){
        Person person = new Person();
        System.out.println(person);
    }


    /**
     * 由于每次给成员属性初始化赋值 都要一个个的 p1.属性= xxx 很是麻烦，因此 构造函数重载 应运而生！
     * 构造函数的重载  多用于对象初始 给成员属性赋值 提供方便
     * 对象创建后  会进入 有参构造函数 给成员属性赋值
     */
    @Test
    public void test2(){
        Person person = new Person("山羊",23,170.5,'男');
        System.out.println(person);
    }
}

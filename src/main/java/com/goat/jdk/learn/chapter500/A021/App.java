package com.goat.jdk.learn.chapter500.A021;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    /**
     * 测试 this 修饰成员属性  可以省略不写
    */
    @Test
    public void test(){
        Student s = new Student("露露",18);
        s.eat();
    }

    /**
     * 测试 this 修饰成员方法  可以省略不写
     */
    @Test
    public void test1(){
        Student s = new Student("露露",18);
        s.play();
    }


    /**
     * 测试 this修饰构造器 this(传入实参)
     * sos this修饰构造器必须放在第一行  将super时 再讲
     */
    @Test
    public void test2(){
        Student s = new Student("露露",18);
        s.play();
    }
}

package com.goat.jdk.learn.chapter005.A023.item01;

import org.junit.Test;

/**
 * 创建对象步骤： 类加载顺序
 * 1. 先对该类进行加载 ClassLoader#loadClass(name, false)   将 static修饰的成员属性  加载到 方法区中的静态域，
 * 2. 依照已加载的class类模板 创建出空对象 （该步骤已经创建对象  但是还没有给成员变量赋值）
 * 3. 找到该类的构造函数  (为了给成员变量赋值)
 * 4. 同一类 只会被加载一次
 */
public class App {

    /**
     * static修饰的成员属性 是先于对象存在的，它并不依托于任何对象。因为此时还没有创建对象呢
     */
    @Test
    public void test(){
        //创建对象：
        Demo t1=new Demo();
        t1.id=10;
        t1.sid=10;

        Demo t2=new Demo();
        t2.id=20;
        t2.sid=20;

        Demo t3=new Demo();
        t3.id=30;
        t3.sid=30;

        //对属性进行读取：
        System.out.println(t1.id);//10
        System.out.println(t2.id);//20
        System.out.println(t3.id);//30
        System.out.println(t1.sid);//30
        System.out.println(t2.sid);//30
        System.out.println(t3.sid);//30
    }

    /**
     *  我们对static修饰的变量最好的访问方式为：类名.属性名  （Demo.sid）
     *  因为 它并不依托于任何对象
    */
    @Test
    public void test2(){
        Demo.sid = 10; // 并没有 new 出对象  仍然可以使用该变量
        System.out.println(Demo.sid);
    }



}

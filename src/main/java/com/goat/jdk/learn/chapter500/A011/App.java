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

    /**
     *  创建对象  断点调试  强制步入 可以看到 执行到 ClassLoader#loadClass(name, false)
    */
    @Test
    public void test(){
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

    /**
     * 演示
     * 1. 成员属性的赋值
     * 2. 成员属性的读取
     * 3. 成员方法的调用
     */
    @Test
    public void test2(){
        System.out.println("========== 成员属性的赋值 ===========");
        Person p1 = new Person();
        p1.name = "山羊";
        p1.age = 23;
        p1.height = 173;
        p1.sex = '男';

        System.out.println("========== 成员属性的读取 ===========");
        System.out.println(p1);

        System.out.println("========== 成员方法的调用 ===========");
        p1.eat();
        p1.sleep("伦敦");
        p1.introduce();
    }


    /**
     * 演示
     * 各个对象的成员属性 都是每个对象所特有的，每个对象都具备自己的成员属性
     * 但是 每个对象的成员方法却是共享的
     * 经过断点调试 可以发现 P1  P2 两个对象调用的成员方法 eat() sleep() introduce()
     * 都是条用的 Person 类中的成员方法 ！
     */
    @Test
    public void test3(){
        Person p1 = new Person();
        p1.name = "山羊1";
        p1.age = 22;
        p1.height = 173;
        p1.sex = '男';
        System.out.println(p1);
        p1.eat();
        p1.sleep("伦敦");
        p1.introduce();

        Person p2 = new Person();
        p2.name = "山羊2";
        p2.age = 24;
        p2.height = 174;
        p2.sex = '男';
        System.out.println(p2);
        p2.eat();
        p2.sleep("伦敦");
        p2.introduce();
    }
}

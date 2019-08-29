package com.goat.jdk.learn.chapter500.C011;

/**
 * 8.类和接口之间是什么关系呢？实现关系:implements
 * 9.一个类要是实现一个接口，必须要实现全部的抽象方法。
 *   Student--》实现类。
 * 10.一个类可以实现多个接口。
 *    一个类只能单继承。
 * 11.假如没有实现全部的抽象方法，那么这个类变成了一个抽象类。
 * 12.一个类可以既实现接口又继承其他类吗？可以：
 * 但是格式必须：先继承再实现：extends Person implements Test,Test2
 * 13.疑问？为啥可以实现多个接口，但是继承只有一个？
 */
public class Student implements Demo,Demo2 {

    @Override
    public void eat() {
        System.out.println("我可以吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("我可以睡觉。");
    }

    @Override
    public void study() {
        System.out.println("我可以学习");
    }

    @Override
    public void drink() {
        System.out.println("我可以喝酒。");
    }
}

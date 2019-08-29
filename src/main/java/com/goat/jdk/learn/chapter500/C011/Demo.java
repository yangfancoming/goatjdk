package com.goat.jdk.learn.chapter500.C011;


public interface Demo {

    /**
     * 常量和抽象方法  前是有固定的修饰符，但是假如不写，系统会默认帮助我们补全。
     * 建议：自己全部都加上。
     */

    //定义常量：
    public static final int NUM = 10;
    public final int NUM2 = 20;

    //定义抽象方法：
    public abstract void eat();
    abstract void sleep();

}

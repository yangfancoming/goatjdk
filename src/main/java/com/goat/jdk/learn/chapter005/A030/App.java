package com.goat.jdk.learn.chapter005.A030;

import org.junit.Test;

public class App {

    /**
     * 封装：
     * 1. 利用修饰符来控制权限来提高代码安全性
     * 2. 即使可以访问也不是随便的访问，因为我在方法中进行了限制。
    */
    @Test
    public void test(){
        Girl g = new Girl();
        g.setAge(32);
        System.out.println(g.getAge());
    }
}

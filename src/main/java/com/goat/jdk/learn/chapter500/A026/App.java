package com.goat.jdk.learn.chapter500.A026;

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
     * 静态块代码执行( 只执行一次 ) ---->  构造块代码执行  ---->  Demo无参构造函数执行
    */
    @Test
    public void test(){
        Demo t1 = new Demo();
        System.out.println("------------------------");
        Demo t2 = new Demo();
        System.out.println("------------------------");
        Demo t3 = new Demo();
    }
}

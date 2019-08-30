package com.goat.jdk.learn.chapter005.A040;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description:
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    /**
     *  可以看到 父类中有的东西，子类中就不用写了，子类都可以继承过来
     *  因此，继承提高了代码的复用性
    */
    @Test
    public void test(){
        Student s = new Student("nana",18,1001);
        System.out.println("我的姓名是："+s.getName()+",我的年龄是："+s.getAge()+",我的学号是："+s.getSno());
        s.eat();
        s.drink();
        s.study();
    }
}

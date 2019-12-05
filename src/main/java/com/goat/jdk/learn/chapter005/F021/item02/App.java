package com.goat.jdk.learn.chapter005.F021.item02;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 *
 *
 *   子类重新实现父类的方法称重写；
 *   重写时可以修改访问权限修饰符和返回值，方法名和参数类型及个数都不可以修改；
 *   仅当返回值为类类型时，重写的方法才可以修改返回值类型，且必须是父类方法返回值类型(Person)的子类(Student)；
 *   要么就不修改，与父类返回值类型相同。
 *   那么，该如何理解呢？为什么要是父类返回值类型的子类？
 */
public class App {

    /**
     * 在子类中 调用 子类重写父类的方法
     */
    @Test
    public void test(){
        Student stu = new Student();
        Person per = new Person();

        per = stu.overRide();
        System.out.println(per.name);
        per = per.overRide();
        System.out.println(per.name);
    }


}

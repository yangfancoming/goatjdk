package com.goat.jdk.learn.chapter005.F021.item02;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---11:24
 */
public class Person {

    String name;

    public Person overRide() {
        Person per = new Person();
        per.name = "Person";
        return per;
    }
}
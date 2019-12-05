package com.goat.jdk.learn.chapter005.F021.item02;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---11:24
 */
public class Student extends Person {

    //test:重写
    @Override
    public Student overRide() {
        Student stu = new Student();
        stu.name = "Student";
        return stu;
    }
}
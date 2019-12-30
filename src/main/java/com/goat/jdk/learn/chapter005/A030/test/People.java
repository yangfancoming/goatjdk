package com.goat.jdk.learn.chapter005.A030.test;

/**
 * Created by Administrator on 2019/12/30.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/30---14:46
 */
public class People {

    private Integer age;
    private String name;

    protected void study(){
        System.out.println("我是人类，人类可以学习");
    }

    public void eat(){
        System.out.println("我是人类，人类可以吃饭");
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

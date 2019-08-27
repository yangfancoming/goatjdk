package com.goat.jdk.learn.chapter500.A016;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/27---20:10
 */
public class Person {

    String name;
    int age;
    double height;
    char sex;

    /* 无参构造函数 */
    public Person() {
        System.out.println("Person类 构造方法 执行！");
    }

    /* 有参构造函数 重载 */
    public Person(String name, int age, double height, char sex) {
        /**
         * 当形参名称 与 成员属性名称 相同时  会发生就近原则：形参覆盖掉成员属性
         * eg: name = name ;  两个name 都引用的是形参
         * 解决方法： 第一个name 前加上 this
        */
        this.name = name;
        this.age = age;
        this.height = height;
        this.sex = sex;
    }

    /* 无返回值  无参数 */
    public void eat(){
        System.out.println("我可以吃饭");
    }

    /* 无返回值 有参数 */
    public void sleep(String address){
        System.out.println("我在" + address + "睡觉");
    }

    /* 有返回值 无参数 */
    public void introduce(){
        System.out.println("我的名字是：" + name + "我的年龄是："+ age + "我的身高是："+ height + "我的性别是：" + sex);
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + ", height=" + height + ", sex=" + sex + '}';
    }
}

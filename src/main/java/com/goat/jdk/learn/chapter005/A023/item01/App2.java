package com.goat.jdk.learn.chapter005.A023.item01;

import org.junit.Test;


public class App2 {

    int id;

    static int sid;

    // 普通方法 可以访问 静态/非静态 成员属性
    public void a(){
        System.out.println(this.id);
        System.out.println(this.sid);
    }

    // 静态方法 只能访问静态成员属性
    public static void b(){
//        System.out.println(id); // 编译报错
        System.out.println(sid);
//        System.out.println(this.sid); // 编译报错
    }

    /**
     * static修饰方法： 由于static 不论是属性还是方法  都是先于对象存在的，它并不依托于任何对象。因为此时还没有创建对象呢
     * 正是因为对象还没有创建呢，
     * 所以我们不可以：不可以在static中用this、
     *                 不可以在static修饰的方法中去访问非静态的变量
     *                 不可以在static修饰的方法中去访问非静态方法
     *
     *
     * 对于普通的方法，我们必须创建对象，用对象去调用。
     * 对于静态的方法，我们可以：（1）类名.方法名  （2）创建对象，对象名.方法名
     */
    @Test
    public void test(){
        this.a();
    }



}

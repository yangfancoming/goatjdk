package com.goat.jdk.learn.chapter500.A021;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/28---15:20
 */
public class Student {

    //无参构造函数
    public Student(){
    }

    // 单参构造函数
    public Student(String name){
        this.name = name;
    }

    /**
     * this指针 先于构造函数创建
     * 因为在还没执行构造函数之前 就已经有了this指针
    */
    public Student(String name,int age){
        this(name);
        this.age = age;
        // this.name=name;
    }

    //属性
    String name;
    int age;

    //方法
    public void eat(){
        System.out.println("我可以吃饭。。");
        System.out.println(this.name);
        System.out.println(name);//this.相当与省略不写了。
    }

    public void play(){
        this.party();
        party();//this.可以省略不写：
        System.out.println("洗澡");
    }

    public void party(){
        System.out.println("吃饭");
        System.out.println("唱歌");
    }

}

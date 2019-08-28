package com.goat.jdk.learn.chapter500.A040;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/28---18:47
 */
public class Person {

    //属性：
    private int age;
    private String name;


    //构造器：
    public Person(){
    }

    public Person(int age,String name){
        this.age=age;
        this.name=name;
    }

    /* 成员方法*/
    public void eat(){
        System.out.println("Person类。。。。。。。我可以吃饭");
    }

    public void drink(){
        System.out.println("Person类。。。。。。。我可以喝酒");
    }

    public String introduce(){
        return "Person类。。。。。。。我可以自我介绍";
    }

    /* setter，getter*/
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }




}
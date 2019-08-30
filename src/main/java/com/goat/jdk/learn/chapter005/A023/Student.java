package com.goat.jdk.learn.chapter005.A023;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: 所有的学生所在学校都是 尚学堂 因此 学校这个变量 使用 static 修饰 更适用
 * @ author  山羊来了
 * @ date 2019/8/28---15:56
 */
public class Student {

    String name;
    int age;
    static String school;//学生所在的学校

    public static void main(String[] args) {
        Student.school="尚学堂";
        //创建一个学生对象：
        Student s1=new Student();
        s1.name="吕鹏昌";
        s1.age=20;
        //s1.school="尚学堂";
        Student s2=new Student();
        s2.name="徐纪华";
        s2.age=19;
        //s2.school="尚学堂";
        Student s3=new Student();
        s3.name="王思远";
        s3.age=20;
        //s3.school="尚学堂";
        System.out.println(s2.school);
    }
}
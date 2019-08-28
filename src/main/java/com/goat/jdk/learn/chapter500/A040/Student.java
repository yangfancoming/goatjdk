package com.goat.jdk.learn.chapter500.A040;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/28---18:51
 */
public class Student extends Person {

    //学号
    private int sno;

    public Student(String name,int age,int sno){
        super.setAge(age);//调用父类的方法
        super.setName(name);//调用父类的方法
        this.sno=sno;
    }

    // 子类特有的方法
    public void study(){
        System.out.println("Student类。。。。。。。我可以学习");
    }

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }


}
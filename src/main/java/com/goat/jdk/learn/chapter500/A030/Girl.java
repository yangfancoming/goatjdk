package com.goat.jdk.learn.chapter500.A030;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/28---18:21
 */
public class Girl {//女孩
    //属性：
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=30){
            this.age=18;
        }else{
            this.age=age;
        }
    }

}
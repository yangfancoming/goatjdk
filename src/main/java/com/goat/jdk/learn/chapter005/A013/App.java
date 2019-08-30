package com.goat.jdk.learn.chapter005.A013;


import org.junit.Test;

/**
     * @Description: 功能描述： 5.1.3   对象、指针、引用 示例
     * @author: Goat
     * @Param:
     * @Return:
     * @Date:   2018/9/3
*/

public class App {

    /**
     * Person{name='null', age=null, married=false, height=0}
    */
    @Test
    public void person(){
        Person p = new Person();
        System.out.println(p);
    }

}

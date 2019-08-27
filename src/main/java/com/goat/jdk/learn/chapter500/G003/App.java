package com.goat.jdk.learn.chapter500.G003;

import org.junit.Test;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description:  instanceof 运算符
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App {

    @Test
    public void test(){
        /**
         *  声明hello时使用Object类，则hello的编译类型是Object，
         *  Object是所有类的父类, 但hello变量的实际类型是String
         *  String与Object类存在继承关系，可以进行instanceof运算
        */
        Object hello = "Hello";
        System.out.println("字符串是否是Object类的实例：" + (hello instanceof Object)); // 返回true
        System.out.println("字符串是否是String类的实例：" + (hello instanceof String)); // 返回true
    }
}

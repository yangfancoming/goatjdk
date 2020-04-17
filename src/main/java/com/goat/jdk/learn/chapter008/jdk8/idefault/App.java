package com.goat.jdk.learn.chapter008.jdk8.idefault;

import com.goat.jdk.learn.chapter008.jdk8.idefault.item01.MyClass;
import com.goat.jdk.learn.chapter008.jdk8.idefault.item02.MyClass2;
import com.goat.jdk.learn.chapter008.jdk8.idefault.item03.MyClass3;
import org.junit.Test;

/**
 * Created by Administrator on 2020/4/17.
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2020/4/17---9:45
 */
public class App {

    MyClass myClass = new MyClass();
    // 一个类实现一个默认实现方法的接口
    @Test
    public void test(){
        // 实体类可以直接调用。
        myClass.myMethod();
    }

    MyClass2 myClass2 = new MyClass2();
    // 一个类实现两个接口，且接口的默认方法名一致
    @Test
    public void test2(){
        myClass2.myMethod();
    }

    MyClass3 myClass3 = new MyClass3();
    // 一个类实现另一个类和接口，其中另一个类和接口中的默认方法名字一致
    @Test
    public void test3(){
        myClass3.myMethod();
    }

}

package com.goat.jdk.learn.chapter009.E001;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.概述
 * 泛型，即“参数化类型”。一提到参数，最熟悉的就是定义方法时有形参，然后调用此方法时传递实参。那么参数化类型怎么理解呢？
 * 顾名思义，就是将类型由原来的具体的类型参数化，类似于方法中的变量参数，此时类型也定义成参数形式（可以称之为类型形参），
 * 然后在使用/调用时传入具体的类型（类型实参）。
 * 泛型的本质是为了参数化类型（在不创建新的类型的情况下，通过泛型指定的不同类型来控制形参具体限制的类型）。也就是说在泛型使用过程中，
 * 操作的数据类型被指定为一个参数，这种参数类型可以用在类、接口和方法中，分别被称为泛型类、泛型接口、泛型方法。
*/
public class App {

    /**
     * ArrayList可以存放任意类型，例子中添加了一个String类型，添加了一个Integer类型，再使用时都以String的方式使用，因此程序崩溃了。
     * 为了解决类似这样的问题（在编译阶段就可以解决），泛型应运而生。
    */
    @Test
    public void test1(){
        List arrayList = new ArrayList();
        arrayList.add("aaaa");
        arrayList.add(100);
        for(int i = 0; i< arrayList.size();i++){
            String item = (String)arrayList.get(i);
            System.out.println("泛型测试item = " + item);
        }
    }

    /**
     * 我们将第一行声明初始化list的代码更改一下，编译器会在编译阶段就能够帮我们发现类似这样的问题
    */
    @Test
    public void test2(){
        List<String> arrayList = new ArrayList<>();
        arrayList.add("aaaa");
        // arrayList.add(100); // 在编译阶段，编译器就会报错
        for(int i = 0; i< arrayList.size();i++){
            String item = arrayList.get(i);
            System.out.println("泛型测试item = " + item);
        }
    }
}

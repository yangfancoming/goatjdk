package com.goat.jdk.learn.chapter009.E001;

import org.junit.Test;

/**
 * 泛型类
 * 泛型的类型参数只能是类类型（包括自定义类），不能是简单类型
*/
public class App3 {

    @Test
    public void test1(){
        //传入的实参类型需与泛型的类型参数类型相同，即为Integer.
        Generic<Integer> genericInteger = new Generic<>(123456);
        System.out.println("key is " + genericInteger.getKey());
        //传入的实参类型需与泛型的类型参数类型相同，即为String.
        Generic<String> genericString = new Generic<>("key_vlaue");
        System.out.println("key is " + genericString.getKey());
    }

    /**
     * 定义的泛型类，就一定要传入泛型类型实参么？
     * 并不是这样，在使用泛型的时候如果传入泛型实参，
     * 则会根据传入的泛型实参做相应的限制，此时泛型才会起到本应起到的限制作用。
     * 如果不传入泛型类型实参的话，在泛型类中使用泛型的方法或成员变量定义的类型可以为任何的类型。
    */
    @Test
    public void test2(){
        Generic generic = new Generic("111111");
        System.out.println("key is " + generic.getKey());

        Generic generic1 = new Generic(4444);
        System.out.println("key is " + generic1.getKey());

        Generic generic2 = new Generic(55.55);
        System.out.println("key is " + generic2.getKey());

        Generic generic3 = new Generic(false);
        System.out.println("key is " + generic3.getKey());
    }
}

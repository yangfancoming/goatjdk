package com.goat.jdk.learn.chapter009.A001.item02;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 * @ Description: 泛型类
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    /**
    */
    @Test
    public void test1(){
        Box<Number> box = new Box<>();
        box.setFirst(100);
        showBox(box);

        Box<Integer> box2 = new Box<>();
        box2.setFirst(200);
        showBox(box2);
    }

    //  使用Box<?> 完美解决
    public static void showBox(Box<?> box){
        Object first = box.getFirst();
        System.out.println(first);
    }


    // 如果使用 Box<Number>   第二个方法会报错
//    public static void showBox(Box<Number> box){
//        Object first = box.getFirst();
//        System.out.println(first);
//    }


    // 泛型不能重载
//    public static void showBox(Box<Integer> box){
//        Integer first = box.getFirst();
//        System.out.println(first);
//    }
}

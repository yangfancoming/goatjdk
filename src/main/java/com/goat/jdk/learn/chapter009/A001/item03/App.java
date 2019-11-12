package com.goat.jdk.learn.chapter009.A001.item03;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description:
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    @Test
    public void test2(){
        // 由于传给T形参的是String，所以构造器参数只能是String
        Apple<String> a1 = new Apple<>("苹果");
        System.out.println(a1.getInfo());

        // 由于传给T形参的是Double，所以构造器参数只能是Double或double
        Apple<Double> a2 = new Apple<>(5.67);
        System.out.println(a2.getInfo());
    }
}

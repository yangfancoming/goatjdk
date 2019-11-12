package com.goat.jdk.learn.chapter009.B001.item01;

import java.util.Random;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/12---20:23
 */
public class FruitGenerator implements Generator<String> {

    private String[] fruits = new String[]{"Apple", "Banana", "Pear"};

    @Override
    public String next() {
        Random rand = new Random();
        return fruits[rand.nextInt(3)];
    }
}
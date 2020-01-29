package com.goat.jdk.learn.chapter008.jdk8.lambda.item02;

import org.junit.Test;

/**
 * Created by Administrator on 2020/1/29.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2020/1/29---17:39
 */
public class App {

    @Test
    public void test(){
        ILove love =(int a) -> {
            System.out.println("i like lambda -->"+a);
        };

        love.lambda(100);

        //简化
        love =(a) -> {
            System.out.println("i like lambda -->"+a);
        };

        love.lambda(50);

        love =a -> {
            System.out.println("i like lambda -->"+a);
        };

        love.lambda(5);

        love =a ->System.out.println("i like lambda -->"+a);
        love.lambda(0);

    }
}

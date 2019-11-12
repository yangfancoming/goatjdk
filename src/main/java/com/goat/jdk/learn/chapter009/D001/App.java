package com.goat.jdk.learn.chapter009.D001;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: 简单泛型
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    @Test
    public void test1(){
        Holder holder = new Holder();
        //持有Integer类型
        holder.setItem(new Integer(3));
        Integer item1 = (Integer) holder.getItem();
        System.out.println(item1);
        //持有String类型
        holder.setItem("hello word");
        String item2 = (String) holder.getItem();
        System.out.println(item2);
    }

}

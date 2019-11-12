package com.goat.jdk.learn.chapter009.D001.item01;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: 简单泛型
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    /**
     *  Holder可用持有任何类型的对象,在例子中先后持有了Integer,String类型的对象,
     *  但是这种方式必须通过强转,而且需要预先知道持有的时什么类型,或者使用instanceof判断,
     *  然后才能强转,否则运行时会报强转失败的异常.
    */
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

    /**
     *    在创建holder2的时候,必须指明想持有什么类型的参数,将其置于尖括号内,
     *    然后你只需要存入指定的类型,在取出时,自动的就是正确的类型了.
     *    通过这个例子,表示了Java泛型的核心概念:告诉编译器你想使用什么类型,然后编译器就帮你处理一切细节.
    */
    @Test
    public void test2(){
        //声明持有Integer类型的holder2
        Holder2<Integer> holder2 = new Holder2<>();
        //持有Integer类型
        holder2.setItem(new Integer(1));
        Integer item1 = holder2.getItem();
        System.out.println(item1);
        //持有string类型.  编译报错
//        holder2.setItem("1234");
    }
}

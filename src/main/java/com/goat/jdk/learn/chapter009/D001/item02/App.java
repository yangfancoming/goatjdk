package com.goat.jdk.learn.chapter009.D001.item02;

import org.junit.Test;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description:  这是一个稍微复杂一点的例子,我们使用泛型实现栈(Stack),来存放不同类型的数据
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 */
public class App {

    @Test
    public void test2(){
        //真的Integer的堆栈
        MyStack<Integer> myStack = new MyStack<>();
        System.out.println(myStack.pop());
        myStack.push(2);
        myStack.push(3);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}

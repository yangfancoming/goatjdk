package com.goat.jdk.learn.chapter008.jdk8.idefault.item02;

import com.goat.jdk.learn.chapter008.jdk8.idefault.MyInterface;
import com.goat.jdk.learn.chapter008.jdk8.idefault.MyInterface2;

/**
 * Created by Administrator on 2020/4/17.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2020/4/17---9:57
 */
public class MyClass2  implements MyInterface, MyInterface2 {

    // 这时我们就不可一直用基类来直接调用方法，因为会报错，说有多个接口的默认方法名一致，需要我们重写方法。
    @Override
    public void myMethod(){
        // 也可以用某个接口的默认方法。 如果我们要保留或者用某个接口的默认方法，只需要在覆盖方法的时候，用  【接口名.super.方法名】
//        MyInterface2.super.myMethod();
        MyInterface.super.myMethod();
    }

}

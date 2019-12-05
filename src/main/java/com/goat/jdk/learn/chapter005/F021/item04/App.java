package com.goat.jdk.learn.chapter005.F021.item04;

import org.junit.Test;

/**
 * Created by Administrator on 2019/12/5.
 *子类在继承父类的一个泛型方法、或子类实现一个接口的泛型方法，编译器会在子类的 class 文件中自动生成桥接方法
 *
 *
 * @ Description: 由于泛型擦除，父类 MerchantOther 的参数实际上是 Customer 类型，为了保证重写的语义，
 * 兼容 1.5（泛型是在 1.5 引入的） 之前的字节码文件，所以生成桥接方法。new NOT_VIP() 传入 Customer 类型的参数，
 * 编译器也不会发现错误。运行时调用了桥接方法，桥接方法中使用 VIP 进行强制类型转换，当参数类型不是 VIP 时，就会抛出类型转换异常。

 * @ author  山羊来了
 * @ date 2019/12/5---14:52
 */
public class App {

    @Test
    public void test(){

        MerchantOther merchantOther = new VIPOnlyMerchant();
        // 调用实际的方法
        merchantOther.actionPrice(80, new VIP());
        // 调用的是桥接方法，出现 java.lang.ClassCastException 的异常
        merchantOther.actionPrice(90, new NOT_VIP());
    }
}

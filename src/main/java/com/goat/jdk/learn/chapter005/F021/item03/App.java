package com.goat.jdk.learn.chapter005.F021.item03;

import org.junit.Test;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: 桥接方法 产生的两种情况：
 * @ author  山羊来了
 * @ date 2019/12/5---14:17
 *
 * 1.重写方法的返回类型是其父类返回类型的子类型
 * 2.重写泛型方法生成桥接
 *
 * 父类 Merchant 的 actionPrice 的返回值是 Number 类型，
 * 子类NaiveMerchant 重写 actionPrice 返回的值类似是 Double 类型，
 * 对于 Java 语言是重写的，但对于 Java 虚拟机解析来说却不是重写的，
 * 只有当两个方法的参数类型以及返回类型一致时，Java 虚拟机才会判定为重写，
 * 为了保持重写的语义，Java 编译器会在 NaiveMerchant 的字节码文件中自动生成一个桥接方法来保证重写语义

 */
public class App {

    @Test
    public void test(){
        Merchant merchant = new NaiveMerchant();
        // price 必须定义成 Number 类型
        Number price = merchant.actionPrice(100);
        System.out.println(price);
    }
}

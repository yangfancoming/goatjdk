package com.goat.jdk.learn.chapter009.A001.item03;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/12---20:49
 */
// 定义Apple类时使用了泛型声明
public class Apple<T> {

    // 使用T类型形参定义实例变量
    private T info;

    // 下面方法中使用T类型形参来定义构造器
    public Apple(T info){
        this.info = info;
    }

    public void setInfo(T info){
        this.info = info;
    }

    public T getInfo(){
        return this.info;
    }
}
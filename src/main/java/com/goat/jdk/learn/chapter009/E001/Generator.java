package com.goat.jdk.learn.chapter009.E001;

/**
 * Created by Administrator on 2019/11/13.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/13---10:57
 */
//定义一个泛型接口
public interface Generator<T> {
    public T next();
}
package com.goat.jdk.learn.chapter009.E001;

/**
 * Created by Administrator on 2019/11/13.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/13---10:57
 */
/**
 * 未传入泛型实参时，与泛型类的定义相同，在声明类的时候，需将泛型的声明也一起加到类中
 * 即：class FruitGenerator<T> implements Generator<T>{
 * 如果不声明泛型，如：class FruitGenerator implements Generator<T>，编译器会报错："Unknown class"
 */
class FruitGenerator<T> implements Generator<T>{
    @Override
    public T next() {
        return null;
    }
}
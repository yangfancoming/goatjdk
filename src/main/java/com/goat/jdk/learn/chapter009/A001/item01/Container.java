package com.goat.jdk.learn.chapter009.A001.item01;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description:  在编译期，是无法知道K和V具体是什么类型，只有在运行时才会真正根据类型来构造和分配内存
 * @ author  山羊来了
 * @ date 2019/11/12---20:19
 */
public class Container<K, V> {

    private K key;
    private V value;

    public Container(K k, V v) {
        key = k;
        value = v;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

package com.goat.jdk.learn.chapter009.D001.item02;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/12---20:34
 */
public  class Node<T> {   //节点

    //数据对象
    T item;
    //下一个节点
    Node<T> next;

    public Node(T item, Node<T> next){
        this.item = item;
        this.next = next;
    }

}

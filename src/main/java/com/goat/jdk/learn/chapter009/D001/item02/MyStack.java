package com.goat.jdk.learn.chapter009.D001.item02;

/**
 * Created by Administrator on 2019/11/12.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/11/12---20:32
 */
public class MyStack<T> {

    //栈顶指针
    private Node<T> top;
    //堆栈大小
    private int count = 0;

    /**
     * 是否时空栈
     * @return
     */
    public boolean isEmpty(){
        return count == 0;
    }

    /**
     * 入栈,压入栈顶
     *
     * @param item
     */
    public void push(T item) {
        Node<T> next = null;
        if (top != null) {
            next = top;
        }
        Node<T> itemNode = new Node<>(item, next);
        top = itemNode;
        count ++;
    }

    /**
     * 出栈
     * @return
     */
    public T pop(){
        if(isEmpty()){
            return null;
        }
        T item = top.item;
        top = top.next;
        count --;
        return item;
    }
}


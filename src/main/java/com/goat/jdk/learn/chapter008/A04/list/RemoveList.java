package com.goat.jdk.learn.chapter008.A04.list;


import com.goat.jdk.learn.chapter008.A04.BaseListData;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * list中循环删除元素问题
     * @author: Goat
     * @Date:  2021年10月29日16:11:58
*/
public class RemoveList extends BaseListData {

    List<String> list = new ArrayList<>(16);
    List<String> linkedList = new LinkedList<>();

    @Before
    public void before(){
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        linkedList.add("5");
    }

    // 集合 循环正序删除一个元素： 导致的问题    虽然删除了2  但是没有遍历出3   因为删除后 数据数据前移了，就相当于指针后移一位。
    @Test
    public void test()  {
        System.out.println("循环前-----" + list);
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
            if(s.equals("2")){
                list.remove(i);
            }
        }
        System.out.println("循环后-----" + list);
    }

    // 集合 循环正序删除一个元素： 链表不能 解决问题。。。。
    @Test
    public void test3()  {
        System.out.println("循环前-----" + linkedList);
        for(int i=0;i<linkedList.size();i++){
            String s = linkedList.get(i);
            System.out.println(s);
            if(s.equals("2")){
                linkedList.remove(i);
            }
        }
        System.out.println("循环后-----" + linkedList);
    }


    // 集合 循环正序删除一个元素： 解析方式  将指针/下标前移一位
    @Test
    public void test1()  {
        System.out.println("循环前-----" + list);
        for(int i=0;i<list.size();i++){
            String s = list.get(i);
            System.out.println(s);
            if(s.equals("2")){
                list.remove(i);
                i--;
            }
        }
        System.out.println("循环后-----" + list);
    }

    // 集合 循环正序删除一个元素： 解析方式  倒叙删除 (因为倒叙删除不会导致指针的移动)
    @Test
    public void test2()  {
        System.out.println("循环前-----" + list);
        for(int i=list.size()-1;i>=0;i--){
            String s = list.get(i);
            System.out.println(s);
            if(s.equals("2")){
                list.remove(i);
            }
        }
        System.out.println("循环后-----" + list);
    }

}

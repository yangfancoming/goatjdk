package com.goat.jdk.learn.chapter009.A001.item04;


import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2019/11/12.
 * @ Description:  <?>和<T> 的区别！！！
 * @ author  山羊来了
 * @ date 2019/11/12---20:10
 *
 *     Object和T不同点在于，Object是一个实打实的类,并没有泛指谁，
 *     而T可以泛指Object，比方public void printList(List<T> list){}方法中可以传入List<Object> list类型参数，
 *     也可以传入List<String> list类型参数，但是public void printList(List<Object> list){}就只可以传入List<Object> list类型参数，
 *     因为Object类型并没有泛指谁，是一个确定的类型
 *
 *     ?和T区别是？是一个不确定类，？和T都表示不确定的类型 ，但如果是T的话，函数里面可以对T进行操作，
 *     比方 T car = getCar()，而不能用？ car = getCar()。
 */
public class App {

    @Test
    public void test2(){
        List<Integer> test1 = Arrays.asList(1, 2, 3);
        List<String>  test2 = Arrays.asList("one", "two", "three");
        List<Object> test3 = Arrays.asList(1, "two", 1.23);
//        List<Fruit> test4 = Arrays.asList(new Apple(), new Banana());

        // 下面这句会编译报错，因为参数不能转化成功
//        printList1(test4);


//        printList1(test3);
//        printList1(test3);

        printList2(test1);
        printList2(test2);
        printList2(test3);

        printList3(test1);
        printList3(test2);
        printList3(test3);

    }


    public static void printList1(List<Object> list) {
        for (Object elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static <T> void printList2(List<T> list) {
        for (T elem : list)
            System.out.println(elem + " ");
        System.out.println();
    }

    public static  void printList3(List<?> list) {
        for (int i = 0;i<list.size();i++)
            System.out.println(list.get(i) + " ");
        System.out.println();
    }

}

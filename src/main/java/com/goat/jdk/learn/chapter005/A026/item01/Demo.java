package com.goat.jdk.learn.chapter005.A026.item01;

/**
 * Created by 64274 on 2019/8/28.
 *
 * @ Description: 类的组成：属性，方法，构造器，代码块(普通块，构造块，静态块，同步块)
 * @ author  山羊来了
 * @ date 2019/8/28---16:18
 */
public class Demo {

    //属性
    int age;
    static int sage;

    //方法
    public void eat(){
        // 普通块
        {
            System.out.println("普通快代码执行");
            int a=10;
        }

        if(1<8){
            int a=20;
        }

        for(int i=0;i<=10;i++){
            int a=30;
        }
//        System.out.println(a); // 这里访问不到 普通块、if块 for块中的 a 变量
    }

    //构造器
    public Demo(){
        System.out.println("Demo无参构造函数执行");
    }

    //构造块
    {
        System.out.println("构造块代码执行");
    }

    //静态块
    static{
        System.out.println("输出静态变量：" + sage);
        System.out.println("静态块代码执行");
    }

}

package com.goat.jdk.learn.chapter007.A021;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;


public class App {

    @Test
    public void test() throws IOException {
        // 获取系统所有的环境变量
        Map<String,String> env = System.getenv();
        for (String name : env.keySet()) {
            System.out.println(name + " ---> " + env.get(name));
        }
        // 获取指定环境变量的值
        System.out.println(System.getenv("JAVA_HOME"));
        // 获取所有的系统属性
        Properties props = System.getProperties();
        // 将所有系统属性保存到props.txt文件中
        props.store(new FileOutputStream("props.txt") , "System Properties");
        // 输出特定的系统属性
        System.out.println(System.getProperty("os.name"));
    }

    @Test
    public void test1() {
        // 根据key 获取特定系统属性
        System.out.println(System.getProperty("os.name"));
        // 根据key 获取特定系统属性  key不存在时 返回null
        System.out.println(System.getProperty("fuck"));
        // 根据key 获取特定系统属性  key不存在时  返回指定的默认值
        System.out.println(System.getProperty("fuck","wahaha"));
    }
}

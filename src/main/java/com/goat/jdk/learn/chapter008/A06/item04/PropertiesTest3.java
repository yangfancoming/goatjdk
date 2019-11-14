package com.goat.jdk.learn.chapter008.A06.item04;


import org.junit.Before;
import org.junit.Test;
import java.util.Properties;

/**
 * Java遍历Properties的所有的元素，四种方法详细总结的代码实例
 */
public class PropertiesTest3 {

    Properties prop = new Properties();

    @Before
    public void before(){
        prop.put("Height", "200");
        prop.put("Width", "");
        prop.put("Scannable", "true");
    }

    @Test
    public void out() {
        // Scannable 和  Width  都存在所以 传入的defaultValue无效
        System.out.println( prop.getProperty("Scannable","false"));
        System.out.println( prop.getProperty("Width","160"));
        // hoho 是不存在的key  返回 defaultValue
        System.out.println( prop.getProperty("hoho","wahaha"));
    }

}

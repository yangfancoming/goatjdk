package com.goat.jdk.learn.chapter008.A06.item04;


import org.junit.Test;
import java.util.Properties;

/**
 * Java遍历Properties的所有的元素，四种方法详细总结的代码实例
 */
public class PropertiesTest3 {

    Properties prop = new Properties();

    @Test
    public void out() {
        prop.put("Height", "200");
        prop.put("Width", "150");
        prop.put("Scannable", "true");
        // get two properties and print them
        System.out.println( prop.getProperty("Scannable","false"));
        System.out.println( prop.getProperty("Width","150"));
    }



}

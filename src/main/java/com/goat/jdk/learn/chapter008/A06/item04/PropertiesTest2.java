package com.goat.jdk.learn.chapter008.A06.item04;


import org.junit.Test;

import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * Java遍历Properties的所有的元素，四种方法详细总结的代码实例
 */
public class PropertiesTest2 {

    Properties properties = new Properties();

    @Test
    public void out() {
        properties.setProperty("username" , "goat");
        properties.setProperty("password" , "12345");

        System.out.println("---------（方式一）------------");
        for (String key : properties.stringPropertyNames()) {
            System.out.println(key + "=" + properties.getProperty(key));
        }

        System.out.println("---------（方式二）------------");
        Set<Object> keys = properties.keySet();//返回属性key的集合
        for (Object key : keys) {
            System.out.println(key.toString() + "=" + properties.get(key));
        }

        System.out.println("---------（方式三）------------");
        Set<Map.Entry<Object, Object>> entrySet = properties.entrySet();//返回的属性键值对实体
        for (Map.Entry<Object, Object> entry : entrySet) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }

        System.out.println("---------（方式四）------------");
        Enumeration<?> e = properties.propertyNames();
        while (e.hasMoreElements()) {
            String key = (String) e.nextElement();
            String value = properties.getProperty(key);
            System.out.println(key + "=" + value);
        }
	}





}

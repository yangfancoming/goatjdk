package com.goat.jdk.learn.chapter008.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 64274 on 2019/3/7.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/3/7---20:39
 */
public class Foo {
    private int code;
    private int count;
    public String name;
    public List<Bar> bars = new ArrayList<>();

    public Foo(String name) {
        this.name = name;
    }

    public Foo(int code, int count) {
        this.code = code;
        this.count = count;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

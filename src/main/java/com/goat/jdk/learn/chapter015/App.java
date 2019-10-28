package com.goat.jdk.learn.chapter015;

import org.junit.Test;

import java.io.*;

/**
 * Created by 64274 on 2019/8/27.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/27---15:01
 */
public class App  {

    @Test
    public void test() throws IOException {
        Writer w = new StringWriter(6);
        FilterWriter fw = new FilterWriter(w) { };
        fw.write(65);
        fw.write(66);
        fw.write(67);
        String s = w.toString();
        System.out.print(s);
    }

    @Test
    public void test1() throws IOException {
        char[] cbuf = { 'A', 'B', 'C', 'D', 'E', 'F' };
        Writer w = new StringWriter(6);
        FilterWriter fw = new FilterWriter(w) {};
        fw.write(cbuf, 2, 4);// @ W  ｗ W. y I ib A i .C O M
        String s = w.toString();
        System.out.print(s);
    }

    @Test
    public void test3() throws IOException {
        String str = "from yiibai.com";
        Writer w = new StringWriter(6);
        FilterWriter fw = new FilterWriter(w) { };
        fw.write(str, 5, 7);
        String  s = w.toString();
        System.out.print(s);
    }
}

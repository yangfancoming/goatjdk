package com.goat.jdk.learn.chapter015;

import java.io.FilterWriter;
import java.io.Writer;

/**
 * Created by 64274 on 2019/8/30.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/8/30---17:27
 */
public class Demo extends FilterWriter {

    public Demo(Writer out) {
        super(out);
    }

//    @Override
    public void write(String string) {
        if (string != null) {
            try {
                out.write(string);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }

//    @Override
    public void flush() {
        try {
            out.flush();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}

package com.goat.jdk.learn.chapter005.F021.item04;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---14:51
 */
public class VIP implements Customer {
    @Override
    public String purchase() {
        return "VIP First !";
    }
}
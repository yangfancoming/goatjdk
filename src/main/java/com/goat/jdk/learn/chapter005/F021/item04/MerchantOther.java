package com.goat.jdk.learn.chapter005.F021.item04;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---14:51
 *
 *
 */
public abstract class MerchantOther<T extends Customer> {

    // public double actionPrice(double price, Customer customer);
    public double actionPrice(double price, T customer) {
        return price * 0.08;
    }
}

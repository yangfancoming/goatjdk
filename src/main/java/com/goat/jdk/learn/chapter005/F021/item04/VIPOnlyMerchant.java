package com.goat.jdk.learn.chapter005.F021.item04;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---14:52
 */
public class VIPOnlyMerchant extends MerchantOther<VIP> {

    /**
     * public double actionPrice(double price, Customer customer) {
     *     return this.actionPrice(price, (VIP) customer);
     * }
     * 桥接方法调用了子类重写的泛型方法
    */
    @Override
    public double actionPrice(double price, VIP customer) {
        return price * 0.07;
    }
}



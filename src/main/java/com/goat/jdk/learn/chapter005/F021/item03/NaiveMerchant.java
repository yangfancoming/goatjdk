package com.goat.jdk.learn.chapter005.F021.item03;

/**
 * Created by Administrator on 2019/12/5.
 *
 * @ Description: TODO
 * @ author  山羊来了
 * @ date 2019/12/5---14:17
 */
public class NaiveMerchant extends Merchant {

    @Override
    public Double actionPrice(double price) {
        return 0.9 * price;
    }

    public static void main(String[] args) {
        Merchant merchant = new NaiveMerchant();
        // price 必须定义成 Number 类型
        Number price = merchant.actionPrice(40);
        System.out.println(price);
    }
}

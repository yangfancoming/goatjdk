package com.goat.jdk.learn.chapter500.F021;


public class Ostrich extends Bird {

	// 重写Bird类的fly()方法
    @Override
	public void fly(){
		System.out.println("我是鸵鸟  我只能在地上奔跑...");
	}

	public void callSuper(){
		// 在子类方法中通过super来显式调用父类被覆盖的方法。
		super.fly();
	}

}
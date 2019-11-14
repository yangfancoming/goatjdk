package com.goat.jdk.learn.chapter008.A05;


import java.util.ArrayDeque;

/**
 * Description:后进先出
 * 1.Deque接口是Queue接口的子接口，它是一个双端队列
 * 2.ArrayDeque实现类，创建Deque同样可以指定一个numElements参数，用于指定Object[]数组长度，默认16
 * 3.下面演示将ArrayDeque当成栈来使用。
 */
public class ArrayDequeStack {

	public static void main(String[] args) {
		ArrayDeque stack = new ArrayDeque();
		
		// 依次将三个元素push入"栈"
		stack.push("疯狂Java讲义");
		stack.push("轻量级Java EE企业应用实战");
		stack.push("疯狂Android讲义");

		System.out.println(stack); // 输出：[疯狂Android讲义, 轻量级Java EE企业应用实战, 疯狂Java讲义]
		System.out.println(stack.peek()); // 访问第一个元素，但并不将其pop出"栈"，输出：疯狂Android讲义
		System.out.println(stack); // 依然输出：[疯狂Android讲义, 疯狂Java讲义, 轻量级Java EE企业应用实战]
		System.out.println(stack.pop()); // pop出第一个元素，输出：疯狂Android讲义
		System.out.println(stack); 	// 输出：[轻量级Java EE企业应用实战, 疯狂Java讲义]
	}
}

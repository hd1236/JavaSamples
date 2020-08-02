 package com.hand.javasamples.DesignPatterns.structure.bridge;


/**
 * 对象的适配-桥接模式
 * 创建一个Bridge抽象，包含对sourceable对象的setter和getter方法，这样对于不同sourceable对象，可以进行切换
 * 桥定义做什么，Sourceable定义怎么做，一组抽象，一组实现，可以相互组合。
 * 也可以理解为一个类有多个维度，通过组合的方式多个维度自由组合起来使用，各个维度相互独立。
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Bridge bridge1 = new MyBridge1();
		Bridge bridge2 = new MyBridge2();
		
		Sourceable source1 = new SourceSub1();
		bridge1.setSource(source1);
		bridge1.method();
		System.out.println();

		Sourceable source2 = new SourceSub2();
		bridge2.setSource(source2);
		bridge2.method();
		System.out.println();

		bridge1.setSource(source2);
		bridge1.method();
		System.out.println();

		bridge2.setSource(source1);
		bridge2.method();
		
	}
}

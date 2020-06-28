package com.hand.javasamples.DesignPatterns.create.adapter.cls;


/**
 * 类的适配
 * Tagetable接口有两个方法，而我只想要实现其中一个method A，可以构造一个Adapter继承一个父类使其实现除A外其他方法
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Targetable target = new Adapter();
		target.method1();
		target.method2();
	}
}

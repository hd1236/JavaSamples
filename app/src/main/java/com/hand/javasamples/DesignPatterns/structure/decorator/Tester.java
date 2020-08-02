 package com.hand.javasamples.DesignPatterns.structure.decorator;


/**
 * 对象的适配-装饰器模式
 * 通过构造器传入兄弟类（共同实现了某接口），在实现方法中对兄弟类方法前后进行装饰
 * 需要扩展一个类时
 * 动态为一个对象增加功能
 *
 * 装饰器模式和代理模式都是继承同样的父类，且通过组合实现。
 * 装饰器语义上是为了增强原有的功能。
 * 代理语义上是为了在原有功能上附加新的功能。
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Sourceable source = new Source();
		Sourceable obj = new Decorator(source);
		obj.method();
	}
}

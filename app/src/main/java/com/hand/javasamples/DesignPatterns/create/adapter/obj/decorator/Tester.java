 package com.hand.javasamples.DesignPatterns.create.adapter.obj.decorator;


/**
 * 对象的适配-装饰器模式
 * 通过构造器传入兄弟类（共同实现了某接口），在实现方法中对兄弟类方法前后进行装饰
 * 需要扩展一个类时
 * 动态为一个对象增加功能
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

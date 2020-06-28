 package com.hand.javasamples.DesignPatterns.create.adapter.obj.bridge;


/**
 * 对象的适配-桥接模式
 * 创建一个Bridge抽象，包含对sourceable对象的setter和getter方法，这样对于不同sourceable对象，可以进行切换
 * 如果没有Computer类，CPU中就要调用Memory对象的方法，然后Memory中调用Disk对象方法，这样造成严重依赖
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Bridge bridge = new MyBridge();
		
		Sourceable source1 = new SourceSub1();
		bridge.setSource(source1);
		bridge.method();
		
		Sourceable source2 = new SourceSub2();
		bridge.setSource(source2);
		bridge.method();
		
		bridge.setSource(source1);
		bridge.method();
		
	}
}

 package com.hand.javasamples.DesignPatterns.create.adapter.obj.facade;


/**
 * 对象的适配-外观模式
 * 类似模拟Computer启动关闭，它的CPU、Memory、Disk也有启动关闭。Computer的构造中new出部件并对他们的启动关闭进行包装
 * 如果没有Computer类，CPU中就要调用Memory对象的方法，然后Memory中调用Disk对象方法，这样造成严重依赖
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Sourceable obj = new Computer();
		obj.startup();
		obj.shutdown();
	}
}

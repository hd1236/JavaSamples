 package com.hand.javasamples.DesignPatterns.structure.proxydynamic;


/**
 * 对象的适配-动态代理模式
 * 利用Proxy.newProxyInstance方法会在程序运行时通过反射机制创建代理类
 * 代理类在调用目标方法时，代理类会调用InvocationHandler的invoke方法，给到方法名和参数
 * 可利用反射代理执行目标方法
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){

		Sourceable source = new Source();
		DynamicInvocationHandler handler = new DynamicInvocationHandler();
		Sourceable proxy = handler.getProxyinstance(source);
		proxy.method1();
	}
}

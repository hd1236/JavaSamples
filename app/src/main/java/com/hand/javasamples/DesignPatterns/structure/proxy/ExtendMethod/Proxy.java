package com.hand.javasamples.DesignPatterns.structure.proxy.ExtendMethod;



/**
 * 代理类，依赖被代理类，常用于被代理类业务功能上附加功能
 * 通过集成被代理类，利用super.调用业务方法
 */
public class Proxy extends Source {

	public Proxy(){
		super();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
		super.method();
		System.out.println("after proxy");
	}

}

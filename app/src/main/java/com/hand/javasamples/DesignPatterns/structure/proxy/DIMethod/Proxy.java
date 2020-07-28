package com.hand.javasamples.DesignPatterns.structure.proxy.DIMethod;


/**
 * 代理类，依赖被代理类，常用于被代理类业务功能上附加功能
 */
public class Proxy implements Sourceable{

	private Sourceable mSource;
	public Proxy(){
		super();
		mSource = new Source();
	}

	public Proxy(Sourceable source){
		mSource = source;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
		mSource.method();
		System.out.println("after proxy");
	}

}

package com.hand.javasamples.DesignPatterns.structure.proxy.DIMethod;

/**
 * 被代理类
 */
public class Source implements Sourceable{

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("this is original method");
	}

}

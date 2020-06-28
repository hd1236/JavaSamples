package com.hand.javasamples.DesignPatterns.create.adapter.obj.proxy;

public class Proxy implements Sourceable{

	private Sourceable mSource;
	public Proxy(){
		super();
		mSource = new Source();
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before proxy");
		mSource.method();
		System.out.println("after proxy");
	}

}

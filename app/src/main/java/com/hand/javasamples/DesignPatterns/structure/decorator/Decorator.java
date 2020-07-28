package com.hand.javasamples.DesignPatterns.structure.decorator;

public class Decorator implements Sourceable{

	private Sourceable mSource;
	public Decorator(Sourceable source){
		super();
		mSource = source;
	}

	@Override
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("before decorator");
		mSource.method();
		System.out.println("after decorator");
	}

}

package com.hand.javasamples.DesignPatterns.structure.decorator;

public class Decorator implements Sourceable{

	private Sourceable mSource;
	public Decorator(Sourceable source){
		super();
		mSource = source;
	}

	@Override
	public void method() {
		//增强原有method，不是简单的新增功能。
		System.out.println("before decorator");
		mSource.method();
		System.out.println("after decorator");
	}

}

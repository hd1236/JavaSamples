package com.hand.javasamples.DesignPatterns.structure.decorator;

public class Decorator1 implements Sourceable{

	private Sourceable mSource;
	public Decorator1(Sourceable source){
		super();
		mSource = source;
	}

	@Override
	public void method() {
		//增强原有method，不是简单的新增功能。
		System.out.println("decorator1 before source");
		mSource.method();
		System.out.println("decorator1 after source");
	}

}

package com.hand.javasamples.DesignPatterns.structure.facade;

public class Memory implements Sourceable {

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("memory startup!");  
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("memory shutdown!");  
	}

}

package com.hand.javasamples.DesignPatterns.structure.facade;

public class CPU implements Sourceable {

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("cpu startup!"); 
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("cpu shutdown!"); 
	}

}

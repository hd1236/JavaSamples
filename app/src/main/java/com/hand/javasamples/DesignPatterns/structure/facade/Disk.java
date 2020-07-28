package com.hand.javasamples.DesignPatterns.structure.facade;

public class Disk implements Sourceable {

	@Override
	public void startup() {
		// TODO Auto-generated method stub
		System.out.println("disk startup!"); 
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("disk shutdown!"); 
	}

}

package com.hand.javasamples.DesignPatterns.action.strategy;

public class Person {
	
	private TransportTravel mTravel;
	
	public Person(TransportTravel travel){
		mTravel = travel;
	}

	public void setTravel(TransportTravel mTravel) {
		this.mTravel = mTravel;
	}

	public void go(){
		System.out.print("Handing");
		mTravel.travel();
	}
}

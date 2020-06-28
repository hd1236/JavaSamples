package com.hand.javasamples.DesignPatterns.create.action.parent.strategy;

public class Person {
	
	private TransportTravel mTravel;
	
	public Person(TransportTravel travel){
		mTravel = travel;
	}

	public void setmTravel(TransportTravel mTravel) {
		this.mTravel = mTravel;
	}

	public void go(){
		System.out.print("Handing");
		mTravel.travel();
	}
}

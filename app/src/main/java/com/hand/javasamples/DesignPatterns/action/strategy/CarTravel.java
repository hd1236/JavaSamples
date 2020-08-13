package com.hand.javasamples.DesignPatterns.action.strategy;

public class CarTravel implements TransportTravel{

	@Override
	public int travel() {
		// TODO Auto-generated method stub
		System.out.println("开车旅行");
		return 0;
	}

}

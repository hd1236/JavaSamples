package com.hand.javasamples.DesignPatterns.action.strategy;

public class AirPlaneTravel implements TransportTravel{

	@Override
	public int travel() {
		// TODO Auto-generated method stub
		System.out.println("飞机旅行");
		return 0;
	}

}

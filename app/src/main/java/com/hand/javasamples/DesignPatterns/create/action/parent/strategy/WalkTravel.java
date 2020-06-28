package com.hand.javasamples.DesignPatterns.create.action.parent.strategy;

public class WalkTravel implements TransportTravel{

	@Override
	public int travel() {
		// TODO Auto-generated method stub
		System.out.println("徒步旅行");
		return 0;
	}

}

package com.hand.javasamples.DesignPatterns.action.template;

public abstract class PersonInHotel {

	public void goOutEat(){
		order();
		eat();
		pay();
	}
	
	protected void order(){
		System.out.println("order");
	}
	
	protected abstract void eat();
	
	protected void pay(){
		System.out.println("pay");
	}
	
}

package com.hand.javasamples.DesignPatterns.action.responsibility;

public class ResponseMain {
	
	public static void main(String []args){
		ResponseManager manager = new ResponseManager();
		manager.addAlgorithmHandler(new Algorithm_1())
		.addAlgorithmHandler(new Algorithm_2())
		.addAlgorithmHandler(new Algorithm_3());
		Params p = manager.doAction();
		System.out.println(p.toString());
	}

}

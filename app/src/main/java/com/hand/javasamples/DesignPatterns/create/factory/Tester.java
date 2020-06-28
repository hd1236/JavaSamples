package com.hand.javasamples.DesignPatterns.create.factory;



public class Tester {
	public static void main(String[] args){
		Factory.Provider provider = new Factory.CakeFactory();
		Factory.Food food = provider.provide();
		food.saled();
		
		provider = new Factory.FruitFactory();
		Factory.Food food2 = provider.provide();
		food2.saled();
		
	}
}

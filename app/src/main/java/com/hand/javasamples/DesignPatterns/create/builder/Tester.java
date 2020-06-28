package com.hand.javasamples.DesignPatterns.create.builder;



public class Tester {
	public static void main(String[] args){
		Builder builder = new Builder();
		builder.produceCake(10);
		builder.produceFruit(10);
		for(Builder.Food food : builder.getFoods()){
			food.saled();
		}
	}
}

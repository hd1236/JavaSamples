package com.hand.javasamples.DesignPatterns.structure.bridge;

public class MyBridge1 extends Bridge {

	public void method(){
		System.out.println("my bridge1");
		getSource().method();
	}
}

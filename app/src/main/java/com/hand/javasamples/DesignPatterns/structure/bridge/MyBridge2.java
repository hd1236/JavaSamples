package com.hand.javasamples.DesignPatterns.structure.bridge;

public class MyBridge2 extends Bridge {

	public void method(){
		System.out.println("my bridge2");
		getSource().method();
	}
}

package com.hand.javasamples.DesignPatterns.structure.bridge;

public class MyBridge extends Bridge {

	public void method(){
		getSource().method();
	}
}

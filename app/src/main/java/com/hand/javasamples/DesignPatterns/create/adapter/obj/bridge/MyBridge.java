package com.hand.javasamples.DesignPatterns.create.adapter.obj.bridge;

public class MyBridge extends Bridge {

	public void method(){
		getSource().method();
	}
}

package com.hand.javasamples.DesignPatterns.structure.bridge;

/**
 * 桥接模式
 */
public abstract class Bridge {

	private Sourceable source;
	
	public void method(){
		source.method();
	}

	public Sourceable getSource() {
		return source;
	}

	public void setSource(Sourceable source) {
		this.source = source;
	}
	
	
}

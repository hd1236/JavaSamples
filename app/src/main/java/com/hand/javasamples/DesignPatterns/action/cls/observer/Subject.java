package com.hand.javasamples.DesignPatterns.action.cls.observer;

public interface Subject {

	void add(Observer o);
	
	void remove(Observer o);
	
	void notifyObservers();
}

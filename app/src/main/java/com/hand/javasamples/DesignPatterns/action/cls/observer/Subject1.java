package com.hand.javasamples.DesignPatterns.action.cls.observer;

import java.util.Vector;

public class Subject1 implements Subject {

	private Vector<Observer> observers = new Vector<>();
	@Override
	public void add(Observer o) {
		// TODO Auto-generated method stub
		observers.add(o);
	}

	@Override
	public void remove(Observer o) {
		// TODO Auto-generated method stub
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(Observer o : observers){
			o.action();
		}
	}

}

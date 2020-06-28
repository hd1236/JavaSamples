package com.hand.javasamples.DesignPatterns.create.action.parent.strategy;


/**
 * 策略模式
 * 定义公共接口并确定接口方法，让每个算法去实现
 * 供外部Person去调用
 * @author admin
 *
 */
public class Tester {
	
	public static void main(String[] args){
		Person hd = new Person(new AirPlaneTravel());
		hd.go();
		hd.setmTravel(new HighRailwayTravel());
		hd.go();
	}
}

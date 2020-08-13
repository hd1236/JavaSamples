package com.hand.javasamples.DesignPatterns.action.strategy;


/**
 * 策略模式
 * 定义公共接口并确定接口方法，让每个算法去实现
 * 供外部Person去调用
 * @author admin
 *
 */
public class Tester {
	
	public static void main(String[] args){
		//这只是利用了多态特性和依赖注入的实现，并没有体现策略模式的优势
		Person hd = new Person(new AirPlaneTravel());
		hd.go();
		hd.setTravel(new HighRailwayTravel());
		hd.go();

		//运行时动态获取并使用才是最显著的特点，体现在策略的创建和使用上。
		//定义一个factory类，通过map缓存无状态策略对象。
		//根据条件判断要获取哪个策略对象。
		/**
		 * 请实现根据距离不同选择不同的方式旅行
		 * 1公里以内，步行
		 * 1-100公里，小车
		 * 100-1000公里，高铁
		 * 1000公里以上，飞机
		 */
		goTravelOpt(hd,999999);
	}

	/**
	 * 一般策略模式
	 * @param p
	 * @param distance
	 */
	private static void goTravel(Person p, int distance){
		if(distance <= 1){
			p.setTravel(new WalkTravel());
		}else if(distance <= 100){
			p.setTravel(new CarTravel());
		}else if(distance <= 1000){
			p.setTravel(new HighRailwayTravel());
		}else{
			p.setTravel(new AirPlaneTravel());
		}
		p.go();
	}

	/**
	 * 去掉if-else的策略模式
	 * @param p
	 * @param distance
	 */
	private static void goTravelOpt(Person p,int distance){
		p.setTravel(TravelFactory.getTravelWay(distance));
		p.go();
	}
}

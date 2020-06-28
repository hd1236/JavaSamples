package com.hand.javasamples.DesignPatterns.create.action.parent.template;


/**
 * 模板方法模式
 * 抽象类PersonInHotel 
 * 抽象方法，有子类实现，模板中多变的步骤
 * 实现方法，可在父类实现，或者有子类覆盖，模板中不多变的步骤
 * 钩子方法，空方法或者返回boolean条件方法，可在子类中实现用于控制模板不同的情形
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		PersonInHotel male = new Male();
		male.goOutEat();
		
		PersonInHotel female = new Female();
		female.goOutEat();
	}
}

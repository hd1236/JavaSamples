package com.hand.javasamples.DesignPatterns.create.factory;


/**
 * 抽象工厂接口
 * @author hand
 *
 */
public class Factory {

	
	static interface Provider{
		Food provide();
	}
	
	static class CakeFactory implements Provider{

		public Food provide() {
			// TODO Auto-generated method stub
			return new Cake();
		}
		
	}
	static class FruitFactory implements Provider{

		public Food provide() {
			// TODO Auto-generated method stub
			return new Fruit();
		}
		
	}
	
	/**
	 * 
	 * @author hand
	 *
	 */
	static interface Food{
		void saled();
	}
	static class Cake implements Food{
		public void saled(){
			System.out.println("Cake sale");
		}
	}
	
	static class Fruit implements Food{

		public void saled() {
			// TODO Auto-generated method stub
			System.out.println("Fruit sale");
		}
	}
}

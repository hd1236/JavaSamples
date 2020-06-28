package com.hand.javasamples.DesignPatterns.create.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 建造者模式
 * @author admin
 *
 */
public class Builder {

	private List<Food> foods = new ArrayList<>();
	public void produceCake(int count){  
        for(int i=0; i<count; i++){  
        	foods.add(new Cake());  
        }  
    }  
      
    public void produceFruit(int count){  
        for(int i=0; i<count; i++){  
        	foods.add(new Fruit());  
        }  
    } 
    
	public List<Food> getFoods() {
		return foods;
	}

	/**
	 * 
	 * @author hand
	 *
	 */
	interface Food{
		void saled();
	}
	class Cake implements Food{
		public void saled(){
			System.out.println("Cake sale");
		}
	}
	
	class Fruit implements Food{

		public void saled() {
			// TODO Auto-generated method stub
			System.out.println("Fruit sale");
		}
	}
}

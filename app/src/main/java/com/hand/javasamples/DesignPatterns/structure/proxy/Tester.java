 package com.hand.javasamples.DesignPatterns.structure.proxy;


 import com.hand.javasamples.DesignPatterns.structure.proxy.DIMethod.Proxy;
 import com.hand.javasamples.DesignPatterns.structure.proxy.DIMethod.Sourceable;

 /**
 * 对象的适配-代理模式
 * 在构造器中new一个兄弟类（共同实现了某接口），在实现方法中对兄弟类方法前后进行全权代理
 * 需要对原有（兄弟类中）方法修改时，如果直接修改违背了开闭原则，可以用代理模式
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Sourceable obj = new Proxy();
		obj.method();
	}
}

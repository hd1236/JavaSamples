package com.hand.javasamples.DesignPatterns.structure.adapter.cls;


/**
 * 类的适配
 * Tagetable接口有两个方法，而我只想要实现其中一个method A，可以构造一个Adapter继承一个父类使其实现除A外其他方法
 *
 * 对象适配
 * 将被适配类通过依赖注入到适配类中进行适配。
 * 
 * @author admin
 *
 */
public class Tester {
	public static void main(String[] args){
		Targetable target = new ClsAdapter();
		target.method1();
		target.method2();

		Targetable target1 = new ObjAdapter(new Source());
		target1.method1();
		target1.method2();
	}
}

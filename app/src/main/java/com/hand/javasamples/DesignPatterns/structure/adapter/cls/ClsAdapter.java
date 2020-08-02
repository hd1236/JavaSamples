package com.hand.javasamples.DesignPatterns.structure.adapter.cls;

/**
 * 类适配模式
 */
public class ClsAdapter extends Source implements Targetable{

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		super.method1();
		System.out.println("this is targetable method");
	}


}

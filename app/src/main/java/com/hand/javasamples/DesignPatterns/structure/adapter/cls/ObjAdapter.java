package com.hand.javasamples.DesignPatterns.structure.adapter.cls;

/**
 * 类适配模式
 */
public class ObjAdapter extends Source implements Targetable{

	private Source mSource;
	public ObjAdapter(Source source){
		mSource = source;
	}
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		mSource.method1();
		System.out.println("this is targetable method");
	}


}

package com.hand.javasamples.DesignPatterns.create.prototype;

import java.io.IOException;


public class Tester {
	public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, IOException{
		Prototype prototype = new Prototype();
		System.out.println("原对象："+prototype+"--int:"+prototype.getmInt()+"--string:"+prototype.getmString()+"--normal:"+prototype.getmNormalObject()+"--seri:"+prototype.getmSerializedObject());
		
		Prototype prototype1 = prototype.clone();
		System.out.println("浅复制对象："+prototype1+"--int:"+prototype1.getmInt()+"--string:"+prototype1.getmString()+"--normal:"+prototype1.getmNormalObject()+"--seri:"+prototype1.getmSerializedObject());
		
		Prototype protatype2 = prototype.deepClone();
		System.out.println("深复制对象："+protatype2+"--int:"+protatype2.getmInt()+"--string:"+protatype2.getmString()+"--normal:"+protatype2.getmNormalObject()+"--seri:"+protatype2.getmSerializedObject());
	}
}

package com.hand.javasamples.DesignPatterns.create.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 原型模式
 * @author admin
 *
 */
public class Prototype implements Cloneable, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mString;
	
	private int mInt;
	
	private SerializedObject mSerializedObject;
	
	private transient Object mNormalObject;//序列化时忽略
	
	public Prototype(){
		mString = "hand";
		mInt = 1;
		mSerializedObject = new SerializedObject();
		mNormalObject = new Object();
	}
	/**
	 * 浅复制，只复制基本数据类，而引用类型变量，指向的还是原对象所指向的。
	 */
	public Prototype clone() throws CloneNotSupportedException{
		Prototype prototype = (Prototype) super.clone();
		return prototype;
	}
	
	/**
	 * 深复制，复制该类所有基本数据类型，和引用Serialized类的变量，有非Seri类引用类型变量会报错需要加transient关键字
	 * @return
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public Prototype deepClone() throws IOException, ClassNotFoundException{
		ByteArrayOutputStream os = new ByteArrayOutputStream();
		ObjectOutputStream oos = new ObjectOutputStream(os);
		oos.writeObject(this);
		
		ByteArrayInputStream is = new ByteArrayInputStream(os.toByteArray());
		ObjectInputStream ois = new ObjectInputStream(is);
		return (Prototype) ois.readObject();
	}
	
	
	public String getmString() {
		return mString;
	}
	public int getmInt() {
		return mInt;
	}
	public SerializedObject getmSerializedObject() {
		return mSerializedObject;
	}
	public Object getmNormalObject() {
		return mNormalObject;
	}
	
 
}

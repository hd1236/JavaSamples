package com.hand.javasamples.javabase;

import java.util.ArrayList;
import java.util.List;


/**
 *  
 * 1、当一个Object为null时，作为一个参数出入到对象方法中，相当于传入了一个null，并非一个实例引用
 * 2、该Object不会被方法所改变，始终是null e.g.测试1、2
 * 3、而当它被指向一个实例化对象后（new了一个object），再传入方法中，这时候就是传入new出来这个对象的引用，从而对这个对象进行操作，e.g.测试3
 * 4、当传入null的object时在方法内实例化了，而将实例化对象返回，则返回得到了是实例化的对象，而传入方法的object依旧是null，
 * 	     这也验证了传入object为null时传入的不是一个引用，而是null，e.g.测试4
 * 结论：所以，不要把一个指向null的变量传入方法，指望在方法里实例化，这样必须有返回值才能得到实例化对象，否则该变量一直未null
 * 而java中的传参是传引用必须将变量实例化传入才算传引用
 */
public class ObjectParam {

	public static void main(String[] args){
		ObjectParam o = new ObjectParam();
		
//		//测试1
//		List<String> data = null;
//		o.setListData(data);
//		System.out.println("data out:"+data);
//		
//		//测试2
//		DemoObject demoObject = null;
//		o.setObjectData(demoObject);
//		System.out.println("DemoObject out:"+demoObject);
		
//		//测试3
//		DemoObject demoObject1 = o.new DemoObject();
//		System.out.println("DemoObject before:"+demoObject1+"--"+demoObject1.number);
//		o.setObjectData(demoObject1);
//		System.out.println("DemoObject after:"+demoObject1+"--"+demoObject1.number);
		
//		//测试3
//		DemoObject demoObject2 = o.new DemoObject();
//		System.out.println("DemoObject2 before:"+demoObject2+"--"+demoObject2.number);
//		DemoObject demoObject3 = o.setObjectData1(demoObject2);
//		System.out.println("DemoObject2 after:"+demoObject2+"--"+demoObject2.number);
//		System.out.println("DemoObject3 after:"+demoObject3+"--"+demoObject3.number);
		
		//测试4
		DemoObject demoObject2 = null;
		System.out.println("DemoObject2 before:"+demoObject2+"--");
		DemoObject demoObject3 = o.setObjectData1(demoObject2);
		System.out.println("DemoObject2 after:"+demoObject2);
		System.out.println("DemoObject3 after:"+demoObject3+"--"+demoObject3.number);
		
	}
	
	/**
	 * List作为参数传入方法进行修改
	 * @param data
	 */
	public void setListData(List<String> data){
		if(data == null){
			data = new ArrayList<String>();
		}
		data.add("aa");
		data.add("bb");
		data.add("cc");
		System.out.println("data in:"+data);
	}
	
	
	public void setObjectData(DemoObject object){
		if(object == null){
			object = new DemoObject();
		}
		object.number = 5;
		System.out.println("DemoObject in:"+object+"---"+object.number);
	}
	
	public DemoObject setObjectData1(DemoObject object){
		if(object == null){
			object = new DemoObject();
		}
		object.number = 5;
		System.out.println("DemoObject in:"+object+"---"+object.number);
		return object;
	}
	
	
	class DemoObject{
		int number;
	}
}

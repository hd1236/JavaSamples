package com.hand.javasamples.Algorithms.sorts;

public class Test {

	
	public static void main(String[] args){
//		int[] a = new int[]{6,2,5,9,3,7,8,2};
////		int[] b = BubbleSort.bubble(a);
////		int[] b = BubbleSort.bubbleFlag(a);
////		int[] b = InsertSort.insert(a);
////		int[] b = SelectSort.select(a);
//		int[] b = MergerSort.merger(a);
//		
//		for(int e : b){
//			System.out.print(e);
//		}
		
		
		final int NUMBER = 100000;
		int[] origin = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			origin[i] = (int) (10000*Math.random());
		}

		int[] a = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			a[i] = origin[i];
		}
		
//		QuickSort.quick(a);
//		
//		for(int e : a){
//			System.out.println(e);
//		}
		
		int[] b = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			b[i] = origin[i];
		}
		
		int[] c = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			c[i] = origin[i];
		}
		
		int[] d = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			d[i] = origin[i];
		}
		
		int[] e = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			e[i] = origin[i];
		}
		
		int[] f = new int[NUMBER];
		for(int i = 0;i < NUMBER;i++){
			f[i] = origin[i];
		}
		
		long time = System.currentTimeMillis();
		InsertSort.insert(a);
		System.out.println("insert耗时："+(System.currentTimeMillis()-time));
		
		long time1 = System.currentTimeMillis();
		BubbleSort.bubble(b);
		System.out.println("bubble耗时："+(System.currentTimeMillis()-time1));
		
		long time2 = System.currentTimeMillis();
		BubbleSort.bubbleFlag(c);
		System.out.println("bubbleFlag耗时："+(System.currentTimeMillis()-time2));
		
		long time3 = System.currentTimeMillis();
		SelectSort.select(d);
		System.out.println("select耗时："+(System.currentTimeMillis()-time3));
		
		long time4 = System.currentTimeMillis();
		MergerSort.merger(e);
		System.out.println("merge耗时："+(System.currentTimeMillis()-time4));
		
		long time5 = System.currentTimeMillis();
		QuickSort.quick(f);
		System.out.println("quick耗时："+(System.currentTimeMillis()-time5));
	}
}

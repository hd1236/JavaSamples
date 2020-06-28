package com.hand.javasamples.DataStructures.bsearch;

public class Test {

	
	public static void main(String[] args){
		int[] a = new int[]{1,3,4,5,6,8,8,8,11,18};
		int index  = NormalBSearch.bsearch4Fist(a, a.length,8);
		System.out.println("index:"+index);
	}
}

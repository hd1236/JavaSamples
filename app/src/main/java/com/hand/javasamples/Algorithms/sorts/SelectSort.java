package com.hand.javasamples.Algorithms.sorts;

public class SelectSort {

	
	public static int[] select(int[] a){
		
		
		for(int i = 0 ,size = a.length;i < size; i++){
			int minIndex = i;
			int j = i;
			for(; j < size; j++){
				if(a[j] < a[minIndex]){
					minIndex = j;
				}
			}
			if(i == minIndex){
				continue;
			}else{
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}
		return a;
	}
}

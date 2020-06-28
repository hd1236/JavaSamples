package com.hand.javasamples.Algorithms.sorts;

public class QuickSort {

	
	public static void quick(int[] a){
		quickSort(a,0,a.length-1);
	}
	
	public static void quickSort(int[] a,int p,int r){
		if(p >= r){
			return;
		}
		
		int q = segment(a,p,r);
		quickSort(a,p,q-1);
		quickSort(a,q+1,r);
	}
	
	
	public static int segment(int[] a,int p,int r){
		int key = a[r];
		int i = p;
		int j = p;
		for(;j < r; j++){
			if(a[j] < key){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
			}
		}
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return i;
	}
}

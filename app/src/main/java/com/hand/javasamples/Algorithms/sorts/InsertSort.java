package com.hand.javasamples.Algorithms.sorts;

/**
 * 插入，有序区和无序区
 * @author admin
 *
 */
public class InsertSort {

	
	public static int[] insert(int[] a){
		for(int i = 0,size = a.length; i < size; i++){
			int temp = a[i];
			int j = i - 1;
			for(; j >= 0; j--){
				if(a[j] > temp){
					a[j+1] = a[j];
				}else{
					break;
				}
			}
			a[j+1] = temp;
		}
		return a;
	}
}

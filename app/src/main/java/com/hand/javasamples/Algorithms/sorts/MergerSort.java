package com.hand.javasamples.Algorithms.sorts;

public class MergerSort {

	
	public static int[] merger(int[] a){
		merge_sort(a,0,a.length-1);
		return a;
	}
	
	
	public static void merge_sort(int[] a,int start,int end){
		/**
		 * 只有一个元素时终止
		 */
		if(start >= end){
			return;
		}
		
		int middle = (start+end)/2;
		
		merge_sort(a,start,middle);
		merge_sort(a,middle+1,end);
		merge(a,start,middle,end);
	}
	
	public static void merge(int[] a,int start,int middle,int end){
		int[] res = new int[end - start + 1];
		int i = start;
		int j = middle+1;
		int k = 0;
		while(i<=middle && j <= end){
			if(a[i] <= a[j]){
				res[k++] = a[i++];
			}else{
				res[k++] = a[j++];
			}
		}
		int s = i,e = middle; 
		if(j <= end){
			s = j;
			e = end;
		}
		
		while(s <= e){
			res[k++] = a[s++];
		}
		for(int i1 = 0; i1 < end - start+1; i1++){
			a[start+i1] = res[i1];
		}
	}
}

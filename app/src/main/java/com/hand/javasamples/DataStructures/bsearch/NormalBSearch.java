package com.hand.javasamples.DataStructures.bsearch;

public class NormalBSearch {

	
	public static int bsearch(int[] a,int n,int value){
		int low = 0;
		int high = n-1;
		while(low <= high){
			int mid = low+(high-low>>1);
			System.out.println("mid:"+mid);
			if(a[mid] < value){
				low = mid+1;
			}else if(a[mid] > value){
				high = mid-1;
			}else{
				return mid;
			}
		}
		return -1;
	}
	
	public static int bsearch4Fist(int[] a,int n,int value){
		int low = 0;
		int high = n-1;
		while(low <= high){
			int mid = low+(high-low>>1);
			System.out.println("mid:"+mid);
			if(a[mid] < value){
				low = mid+1;
			}else if(a[mid] > value){
				high = mid-1;
			}else{
				if(mid == 0 || a[mid-1] < value){
					return mid;
				}else{
					high = mid -1;
				}
				
			}
		}
		return -1;
	}
}

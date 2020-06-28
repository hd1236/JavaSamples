package com.hand.javasamples.Algorithms.sorts;

/**
 * 
 * @author admin
 *
 */
public class BubbleSort {
	
	
	public static int[] bubble(int[] a){
		for(int i = 0,size = a.length;i<size;i++){
			for(int j = size-1;j > i;j--){
				if(a[j] < a[j-1]){
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		return a;
	}
	
	public static int[] bubbleFlag(int[] a){
		if(a.length <= 1){
			return a;
		}
		for(int i = 0,size = a.length;i<size;++i){
			boolean flag = false;
			for(int j =0;j<size-i-1;++j){
				if(a[j] > a[j+1]){
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					flag = true;
				}
			}
			if(!flag){
				break;
			}
		}
		return a;
	}
}

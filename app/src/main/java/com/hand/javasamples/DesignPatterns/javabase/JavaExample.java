package com.hand.javasamples.DesignPatterns.javabase;

import android.annotation.TargetApi;
import android.os.Build;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.function.BiConsumer;

public class JavaExample {

	@TargetApi(Build.VERSION_CODES.N)
	public static void main(String[] args){
		String[] a = new String[]{"a","bbb"};
        List<String> list = Arrays.asList(a);
//        list.add("ccc");
//        for(String s : list){
//        	System.out.println(s);
//        }
        Map<String, String> map = new HashMap<String, String>();
        map.put("aaa", "111");
        map.put("bbb", "222");
        map.forEach(new BiConsumer<String, String>() {
        	@Override
        	public void accept(String t, String u) {
        		// TODO Auto-generated method stub
        		System.out.println(t+"--"+u);
        	}
		});
	}
}

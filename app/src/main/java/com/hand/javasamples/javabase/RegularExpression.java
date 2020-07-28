package com.hand.javasamples.javabase;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 */
public class RegularExpression {
	
	public static void main(String[] args){
		
		String line = "This order was placed adefor QT3000! OK?";
	    String pattern = "(\\D*)(\\d+)";
		match1(line,pattern);
	}
	
	private static void match1(String string,String pattern){
		
		Pattern r = Pattern.compile(pattern);
		Matcher m = r.matcher(string);
		while(m.find()){
			System.out.println("找到了"+m.groupCount());
			for(int i = 0 ; i < m.groupCount(); i++){
				System.out.println("Found value:" + m.group(i));
			}
		}
	}
}

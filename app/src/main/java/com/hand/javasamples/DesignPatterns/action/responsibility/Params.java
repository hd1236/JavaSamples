package com.hand.javasamples.DesignPatterns.action.responsibility;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Params {

	List<AlgorithmHandler> AlgorithmHandlers;
	private Map<String,String> map = new HashMap<String, String>();
	public int algorithma1;
	public int algorithma2;
	public int algorithma3;
	
	public Params(List<AlgorithmHandler> as){
		AlgorithmHandlers  = as;
	}
	public Map<String,String> getMap(){
		return map;
	}
	
	public Params send(Params p, int index){
		if(AlgorithmHandlers.size() <= index){
			return p;
		}
		return AlgorithmHandlers.get(index).caculate(p,index);
	}
	@Override
	public String toString() {
		return "Params [AlgorithmHandlers=" + AlgorithmHandlers + ", map="
				+ map + ", algorithma1=" + algorithma1 + ", algorithma2="
				+ algorithma2 + ", algorithma3=" + algorithma3 + "]";
	}
	
	
}

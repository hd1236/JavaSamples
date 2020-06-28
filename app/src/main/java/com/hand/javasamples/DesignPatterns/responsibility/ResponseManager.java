package com.hand.javasamples.DesignPatterns.responsibility;

import java.util.ArrayList;
import java.util.List;

public class ResponseManager{

	List<AlgorithmHandler> AlgorithmHandlers = new ArrayList<>();
	
	public ResponseManager addAlgorithmHandler(AlgorithmHandler e){
		AlgorithmHandlers.add(e);
		return this;
	}
	

	public Params doAction() {
		// TODO Auto-generated method stub
		if(AlgorithmHandlers.size() == 0){
			return null;
		}
		AlgorithmHandler a = AlgorithmHandlers.get(0);
	
		return a.caculate(new Params(AlgorithmHandlers),0);
	}
}

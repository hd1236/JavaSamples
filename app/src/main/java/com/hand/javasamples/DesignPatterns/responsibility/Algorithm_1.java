package com.hand.javasamples.DesignPatterns.responsibility;

import java.util.Map;

public class Algorithm_1 implements AlgorithmHandler{

	@Override
	public Params caculate(Params p, int index) {
		// TODO Auto-generated method stub
		p.algorithma1 = 0;
		Map<String,String> map = p.getMap();
		map.put(this.getClass().getSimpleName(), this.getClass().getSimpleName());
		System.out.println(getClass().getSimpleName());
		return p.send(p, index+1);
	}

}

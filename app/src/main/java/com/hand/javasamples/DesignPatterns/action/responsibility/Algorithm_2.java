package com.hand.javasamples.DesignPatterns.action.responsibility;

import java.util.Map;

public class Algorithm_2 implements AlgorithmHandler{

	@Override
	public Params caculate(Params p, int index) {
		// TODO Auto-generated method stub
		p.algorithma2 = 1;
		Map<String,String> map = p.getMap();
		map.put(this.getClass().getSimpleName(), this.getClass().getSimpleName());
		System.out.println(getClass().getSimpleName());
		return p;//默认到算法2拦截处理，不往下传递
//		return p.send(p, index+1);
	}

}

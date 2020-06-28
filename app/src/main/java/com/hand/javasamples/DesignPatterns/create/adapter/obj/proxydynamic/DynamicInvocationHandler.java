package com.hand.javasamples.DesignPatterns.create.adapter.obj.proxydynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicInvocationHandler implements InvocationHandler{
	
	private Sourceable mSource;
	public Sourceable getProxyinstance(Sourceable s){
		mSource = s;
		return (Sourceable)Proxy.newProxyInstance(s.getClass().getClassLoader(),s.getClass().getInterfaces(),this);
	}

	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2)
			throws Throwable {
		System.out.println("方法执行前");
		Object o = arg1.invoke(mSource, arg2);
		System.out.println("方法执行后");
		return o;
	}

}

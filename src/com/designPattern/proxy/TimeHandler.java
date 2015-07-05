package com.designPattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler {
	private Object target;

	public TimeHandler(Object target) {
		// TODO Auto-generated constructor stub
		this.target = target;
	}

	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		long begin = System.currentTimeMillis();
		System.out.println("begin:" + begin);
		method.invoke(target, args);
		long end = System.currentTimeMillis();
		System.out.println("end:" + end);
		System.out.println("useTime:" + (end - begin));
		return null;
	}

}

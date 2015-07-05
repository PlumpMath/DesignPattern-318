package com.designPattern.proxy;

import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Class[] classes = {Actable.class};
		Actable a = (Actable) Proxy.newProxyInstance(Actable.class.getClassLoader(),  classes, new TimeHandler(new Person()));
		a.doSomething();
	}
}

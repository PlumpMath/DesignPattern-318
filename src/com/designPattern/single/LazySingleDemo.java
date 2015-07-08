package com.designPattern.single;

/**
 * 懒汉模式(lazy加载)
 * 
 * @author json
 *
 */
public class LazySingleDemo {

	private static LazySingleDemo s = null;

	private LazySingleDemo() {

	}

	public static synchronized LazySingleDemo getInstance() {
		if (s == null) {
			s = new LazySingleDemo();
		}
		return s;
	}
}

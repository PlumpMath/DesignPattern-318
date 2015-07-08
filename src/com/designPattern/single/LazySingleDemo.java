package com.designPattern.single;

/**
 * ����ģʽ(lazy����)
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

package com.designPattern.single;

/**
 * ¿¡∫∫ƒ£ Ω(lazyº”‘ÿ)
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

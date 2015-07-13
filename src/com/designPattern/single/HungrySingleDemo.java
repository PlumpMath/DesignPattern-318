package com.designPattern.single;

/**
 * 饿汉模式(效率高)
 * @author json
 *
 */
public class HungrySingleDemo {

	private static HungrySingleDemo s = new HungrySingleDemo();

	private HungrySingleDemo() {

	}

	public static HungrySingleDemo getInstance() {
	
		return s;
	}
}

package com.designPattern.single;

/**
 * 饿汉单例模式(效率高)
 * @author json
 *
 */
public class HungrySingleDemo {

	private static HungrySingleDemo s = new HungrySingleDemo();

	private HungrySingleDemo() {

	}

	public HungrySingleDemo getInstance() {
	
		return s;
	}
}

package com.designPattern.single;

/**
 * ��������ģʽ(Ч�ʸ�)
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

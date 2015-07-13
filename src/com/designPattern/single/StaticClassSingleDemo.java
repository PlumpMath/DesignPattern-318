package com.designPattern.single;

public class StaticClassSingleDemo {

	/**
	 * 静态内部类实现单例模式
	 * @author json
	 *
	 */
	private static class StaticClassSingle {
		private static StaticClassSingleDemo staticClassSingleDemo = new StaticClassSingleDemo();
	}

	private StaticClassSingleDemo() {

	}

	public static StaticClassSingleDemo getInstance() {
		return StaticClassSingle.staticClassSingleDemo;
	}
}

package com.designPattern.factory.abstractFactory;

import java.io.IOException;
import java.util.Properties;

public class Test {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Properties prop = new Properties();
		prop.load(Test.class.getClassLoader().getResourceAsStream("com/designPattern/factory/abstractFactory/factory.properties"));
		String factoryName = prop.getProperty("factoryName");
		AbstractFactory factory = (AbstractFactory) Class.forName(factoryName).newInstance();
		Weapon w = factory.createWeapon();
		Food f = factory.createFood();
		w.shot();
		f.printName();
	}

}

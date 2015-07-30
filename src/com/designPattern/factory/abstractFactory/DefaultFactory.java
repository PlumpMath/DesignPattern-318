package com.designPattern.factory.abstractFactory;

public class DefaultFactory extends AbstractFactory{

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new Hunburger();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Gun();
	}

}

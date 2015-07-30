package com.designPattern.factory.abstractFactory;

public class PersonalFactory extends AbstractFactory {

	@Override
	public Food createFood() {
		// TODO Auto-generated method stub
		return new FrechFrice();
	}

	@Override
	public Weapon createWeapon() {
		// TODO Auto-generated method stub
		return new Knife();
	}

}

package com.designPattern.observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Customer customer = new Customer();
			customer.rigisterObserver(new  AccountObserver(customer));
			customer.rigisterObserver(new LogisticsObserver(customer));
			customer.setStatus(1);
			customer.Notify();
	}

}

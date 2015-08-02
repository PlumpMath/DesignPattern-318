package com.designPattern.observer;

public class AccountObserver implements Observer{
	
	private Customer customer;
	public AccountObserver(Customer customer){
		this.customer = customer;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		if(customer.getStatus() == 1){
				System.out.println("买家已付款");
		}else{
			System.out.println("do nothing");
		}
	}

}

package com.designPattern.observer;

public class LogisticsObserver implements Observer{

	private Customer customer;
	public LogisticsObserver(Customer customer){
		this.customer = customer;
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
			if(customer.getStatus() == 1){
					System.out.println("安排发货");
			}else{
				System.out.println("do nothing");
			}
	}

}

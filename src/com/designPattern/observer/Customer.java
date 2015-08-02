package com.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Customer implements Observerable {
	private int status;
	private List<Observer> observers = new ArrayList<Observer>();

	@Override
	public void Notify() {
		// TODO Auto-generated method stub
		for (Observer o : observers) {
			o.update();
		}
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void rigisterObserver(Observer observer) {
		observers.add(observer);
	}

	public void detachObserver(Observer observer) {
		observers.remove(observer);
	}
}

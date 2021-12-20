package com.dbs.observer;

import java.util.ArrayList;
import java.util.List;

public class Loan implements Subject {

	private String type;
	private float interest;
	private String bank;

	Loan(String type, float interest, String bank) {
		this.type = type;
		this.interest = interest;
		this.bank = bank;
	}

	List<Observer> observers = new ArrayList<>();

	@Override
	public void registerObserver(Observer ob) {
		observers.add(ob);
	}

	@Override
	public void removeObserver(Observer ob) {
		observers.remove(ob);
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			System.out.println("Notifying Observers on change in Loan interest rate ");
			observer.update(this.interest);
		}

	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getInterest() {
		return interest;
	}

	public void setInterest(float interest) {
		this.interest = interest;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
